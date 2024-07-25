package lk.vau.fas.dps.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.dps.Model.Undergraduate;
import lk.vau.fas.dps.Repo.UndergraduateRepo;

@Service
public class UndergraduateService extends GenericService<Undergraduate, String>{
	@Autowired
	private UndergraduateRepo repo;
	
	public List<Undergraduate> getFemales(){
		return repo.findFUndergraduates();
	}
}
