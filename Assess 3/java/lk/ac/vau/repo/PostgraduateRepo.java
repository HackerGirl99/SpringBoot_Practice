package lk.ac.vau.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.model.PostGraduate;

@Repository
public interface PostgraduateRepo extends GenericRepo<PostGraduate, String> {
	@Query("select p from PostGraduate p where p.gender = ?1 and p.researchInterest like %?2%")
	public List<PostGraduate> genderReserach(String gender,String research);

}
