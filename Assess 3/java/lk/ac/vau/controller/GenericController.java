package lk.ac.vau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lk.ac.vau.service.GenericService;

public abstract class  GenericController<T,K> {
	@Autowired
	private GenericService<T, K> service;
	
	@GetMapping
	public ResponseEntity<List<T>> getAllElements(){
		return new ResponseEntity<List<T>>(service.getAll(), HttpStatus.OK) ;
	}
	
	@GetMapping("{id}")
	public ResponseEntity<T> getElement(@PathVariable("id") K id) {
		return new ResponseEntity<T>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<String> addNewElement(@RequestBody T t) {
		service.add(t);
		return new ResponseEntity<String>(t.getClass().getSimpleName()+" created", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<String>updateElement(@PathVariable("id") K id,@RequestBody T t){
		service.update(id, t);
		return new ResponseEntity<String>(t.getClass().getSimpleName()+" updated", HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteElement(@PathVariable("id") K id){
		service.delete(id);
		return new ResponseEntity<String>(service.getById(id).getClass().getSimpleName()+" updated", HttpStatus.OK);
	}
}
