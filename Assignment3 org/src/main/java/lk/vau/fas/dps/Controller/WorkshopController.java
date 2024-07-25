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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.dps.Model.Workshop;
import lk.vau.fas.dps.Service.WorkshopService;

@RestController
@RequestMapping("/workshop")
public class WorkshopController extends GenericController<Workshop, String>{
	@Autowired
	private WorkshopService service;
	
	@GetMapping()
	public ResponseEntity<List<Workshop>>getAllnames(){
		return new ResponseEntity<List<Workshop>>(service.getAllWorkshops(), HttpStatus.OK);
	}
	
	@PostMapping
    public ResponseEntity<String> addWorkshop(@RequestBody Workshop workshop) {
        service.addWorkshop(workshop);
        return ResponseEntity.status(HttpStatus.CREATED).body("New workshop added");
    }
	
	//Update
	@PutMapping("{id}")
	public ResponseEntity<String>updateWorkshop(@RequestBody Workshop ele, @PathVariable("id") Integer id){
		return new ResponseEntity<String>(service.updateWorkshop(id, ele), HttpStatus.OK);
	}
		
	//Delete("{id}")
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteWorkshop(@PathVariable("id") Integer id){
		return new ResponseEntity<String>(service.deleteWorkshop(id), HttpStatus.OK);
	}
}
