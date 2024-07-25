package lk.ac.vau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.model.Presenter;
import lk.ac.vau.repo.PresentorRepo;
@Service
public class PresentorService extends GenericService<Presenter, String> {
	@Autowired
	private PresentorRepo repo;
	
	public List<String>SessionNames(String id){
		return repo.SessionNames(id);
	}

}
