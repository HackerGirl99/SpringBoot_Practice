package lk.ac.vau.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.model.UnderGraduate;
@Repository
public interface UndergraduateRepo extends GenericRepo<UnderGraduate, String> {
	
	@Query("select u from UnderGraduate u where u.gender = 'Female'")
	public List<UnderGraduate>femaleUnderGraduates();

}
