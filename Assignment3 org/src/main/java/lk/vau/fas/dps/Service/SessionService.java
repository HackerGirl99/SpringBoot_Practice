package lk.vau.fas.dps.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.dps.Model.Session;
import lk.vau.fas.dps.Repo.SessionRepo;

@Service
public class SessionService extends GenericService<Session, String>{
	@Autowired
	private SessionRepo repo;
	
	public int getCount(String id){
		return repo.findSessionCount(id);
	}
}
