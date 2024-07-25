package lk.vau.fas.dps.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.dps.Model.Presenter;
import lk.vau.fas.dps.Service.PresenterService;

@RestController
@RequestMapping("/post_graduate")
public class PresenterController extends GenericController<Presenter, String>{
	@Autowired
	private PresenterService service;
	
	@GetMapping("/{id}/titles")
	public ResponseEntity<List<String>>getTitles(@PathVariable("id") String id){
		return new ResponseEntity<List<String>>(service.getTitles(id), HttpStatus.OK);
	}
}
