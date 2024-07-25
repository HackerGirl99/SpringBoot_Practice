package lk.vau.fas.dps.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.dps.Model.Presenter;
import lk.vau.fas.dps.Repo.PresenterRepo;

@Service
public class PresenterService extends GenericService<Presenter, String>{
	@Autowired
	private PresenterRepo repo;
	
	public List<String> getTitles(String id){
		return repo.findSessionTitle(id);
	}
}
