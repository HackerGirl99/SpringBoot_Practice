package lk.vau.fas.dps.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.dps.Model.Session;
import lk.vau.fas.dps.Service.SessionService;

@RestController
@RequestMapping("/post_graduate")
public class SessionController extends GenericController<Session, String>{
	@Autowired
	private SessionService service;
	
	@GetMapping("/{id}/count")
	public ResponseEntity<Integer>getTitles(@PathVariable("id") String id){
		return new ResponseEntity<Integer>(service.getCount(id), HttpStatus.OK);
	}
}
