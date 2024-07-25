package lk.ac.vau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.model.UnderGraduate;
import lk.ac.vau.repo.UndergraduateRepo;
@Service
public class UndergraduateService extends GenericService<UnderGraduate, String> {

	@Autowired
	private UndergraduateRepo repo;
	
	public List<UnderGraduate>femaleUnderGraduates(){
		return repo.femaleUnderGraduates();
	}
}
