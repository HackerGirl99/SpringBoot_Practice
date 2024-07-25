package lk.ac.vau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.model.Session;
import lk.ac.vau.repo.SessionRepo;
@Service
public class SessionService extends GenericService<Session, String> {
	@Autowired
	private SessionRepo repo;

	public int NumberOfParticipants(String sessionId) {
		int unGrads= repo.findById(sessionId).get().getUnderGraduates().size();
		int postGrads= repo.findById(sessionId).get().getPostGraduates().size();
		return unGrads+postGrads;
	}
}
