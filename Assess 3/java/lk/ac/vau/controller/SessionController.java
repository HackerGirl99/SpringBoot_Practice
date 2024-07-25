package lk.ac.vau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.model.Session;
import lk.ac.vau.service.SessionService;

@RestController
@RequestMapping("/session")
public class SessionController extends GenericController<Session, String> {
	@Autowired
	private SessionService service;
	@GetMapping("{id}/noparticipants")
	public ResponseEntity<Integer> getNumberOfParticipants(@PathVariable("id") String id) {
		return new ResponseEntity<Integer>(service.NumberOfParticipants(id),HttpStatus.OK);
	}

}
