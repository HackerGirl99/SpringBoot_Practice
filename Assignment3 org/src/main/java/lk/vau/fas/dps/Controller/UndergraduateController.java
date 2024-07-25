package lk.vau.fas.dps.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.dps.Model.Undergraduate;
import lk.vau.fas.dps.Service.UndergraduateService;

@RestController
@RequestMapping("/post_graduate")
public class UndergraduateController extends GenericController<Undergraduate, String>{
	@Autowired
	private UndergraduateService service;
	
	@GetMapping("/females")
	public ResponseEntity<List<Undergraduate>>getFemales(){
		return new ResponseEntity<List<Undergraduate>>(service.getFemales(), HttpStatus.OK);
	}
}


//
