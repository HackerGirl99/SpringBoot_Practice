package lk.vau.fas.dps.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.dps.Service.GenericService;
@RestController
public class GenericController<T, K> {
	@Autowired
	private GenericService<T, K> service;
	
	@GetMapping
	public ResponseEntity<List<T>>getAll(){
		return new ResponseEntity<List<T>>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<T>getById(@PathVariable("id") K id){
		return new ResponseEntity<T>(service.getById(id), HttpStatus.OK);
	}
	
	//Post
	@PostMapping
	public ResponseEntity<String>addElement(@RequestBody T ele){
		return new ResponseEntity<String>(service.addEle(ele), HttpStatus.OK);
	}
	
	//Update
	@PutMapping("{id}")
	public ResponseEntity<String>updateElement(@RequestBody T ele, @PathVariable("id") K id){
		return new ResponseEntity<String>(service.updateEle(id, ele), HttpStatus.OK);
	}
	
	//Delete("{id}")
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteElement(@PathVariable("id") K id){
		return new ResponseEntity<String>(service.deleteEle(id), HttpStatus.OK);
	}
}
