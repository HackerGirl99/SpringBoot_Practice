package lk.vau.fas.dps.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import lk.vau.fas.dps.Model.Workshop;
import lk.vau.fas.dps.Repo.WorkshopRepo;

@Service
public class WorkshopService{
	@Autowired
	private WorkshopRepo repo;
	
	public List<Workshop>getAllWorkshops(){
		return repo.findAll();
	}
	
	public String addWorkshop(Workshop ele) {
		try {
	        repo.save(ele);
	        return "Added Successfully";
	    } catch (DuplicateKeyException e) {
	        return "User already exists.";
	    }
		
	}
	
	public String updateWorkshop(Integer id, Workshop ele) {
		if(repo.findById(id).isEmpty()){
			return "Element not found";
		}
		try {
	        repo.save(ele);
	        return "Updated Successfully";
	    } catch (DuplicateKeyException e) {
	        return "User already exists.";
	    }
	} 
	
	public String deleteWorkshop(Integer id) {
		if(repo.findById(id).isEmpty()){
			return "Element not found";
		}
		repo.delete(repo.findById(id).get());
		return "Deleted Successfully";
	} 
}
