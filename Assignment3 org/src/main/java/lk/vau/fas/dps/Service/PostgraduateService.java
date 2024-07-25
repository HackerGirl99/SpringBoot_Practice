package lk.vau.fas.dps.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.dps.Model.Postgraduate;
import lk.vau.fas.dps.Repo.PostgraduateRepo;

@Service
public class PostgraduateService extends GenericService<Postgraduate, String>{
	@Autowired
	private PostgraduateRepo repo;
}
