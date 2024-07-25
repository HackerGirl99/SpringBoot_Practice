package lk.ac.vau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.model.Workshop;
import lk.ac.vau.service.WorkshopService;

@RestController
@RequestMapping("/workshop")
public class WorkshopController extends GenericController<Workshop, Integer> {
	@Autowired
	private WorkshopService service;
	
	@PostMapping
	public ResponseEntity<String> addNewElement(@RequestBody Workshop workshop) {
		service.addWorkshop(workshop);
		return new ResponseEntity<String>(" New workshop created", HttpStatus.OK);
	}

}
