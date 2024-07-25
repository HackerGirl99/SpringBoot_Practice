package lk.ac.vau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.model.Presenter;
import lk.ac.vau.service.PresentorService;

@RestController
@RequestMapping("/presentor")
public class PresentorController extends GenericController<Presenter, String> {
	@Autowired
	private PresentorService service;
	
	@GetMapping("{id}/sessionnames")
	public ResponseEntity<List<String>> getSessionsName(@PathVariable("id") String id) {
		return new ResponseEntity<List<String>>(service.SessionNames(id),HttpStatus.OK);
	}
}
