package lk.ac.vau.service;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import lk.ac.vau.model.Workshop;
@Service
public class WorkshopService extends GenericService<Workshop, Integer> {
	
	public Workshop addWorkshop(Workshop workshop) {
		if(getById(workshop.getId())!=null) {
			throw new DuplicateKeyException("The id is already in use !");
		}
		return add(workshop);
		
	}

}
