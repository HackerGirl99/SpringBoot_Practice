package lk.ac.vau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.model.PostGraduate;
import lk.ac.vau.service.PostgraduateService;

@RestController
@RequestMapping("/pgrad")
public class PostgraduateController extends GenericController<PostGraduate, String> {
	@Autowired
	private PostgraduateService service;
	
	@GetMapping("/{g}/{r}")
	public ResponseEntity<List<PostGraduate>> getByGenderResearch(@PathVariable("g")String gender,@PathVariable("r") String research) {
		return new ResponseEntity<List<PostGraduate>>(service.findByGenderAndResearch(gender,research),HttpStatus.OK);
	}

}
