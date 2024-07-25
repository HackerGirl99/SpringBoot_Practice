package lk.ac.vau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.model.UnderGraduate;
import lk.ac.vau.service.UndergraduateService;

@RestController
@RequestMapping("/ugrad")
public class UndergraduateController extends GenericController<UnderGraduate, String> {
	@Autowired
	private UndergraduateService service;
	
	@GetMapping("/female")
	public ResponseEntity<List<UnderGraduate>> getFemales() {
		return new ResponseEntity<List<UnderGraduate>>(service.femaleUnderGraduates(),HttpStatus.OK);
	}
	
}
