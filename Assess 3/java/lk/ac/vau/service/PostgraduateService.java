package lk.ac.vau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.model.PostGraduate;
import lk.ac.vau.repo.PostgraduateRepo;
@Service
public class PostgraduateService extends GenericService<PostGraduate, String> {
	@Autowired
	private PostgraduateRepo repo;
	
	public List<PostGraduate>findByGenderAndResearch(String gender,String research){
		return repo.genderReserach(gender, research);
	}

}
