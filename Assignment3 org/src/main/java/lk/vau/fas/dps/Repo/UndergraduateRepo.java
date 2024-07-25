package lk.vau.fas.dps.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.vau.fas.dps.Model.Undergraduate;
@Repository
public interface UndergraduateRepo extends GenericRepo<Undergraduate, String>{
	@Query("select * from undergraduates where gender='Female'")
	public List<Undergraduate>findFUndergraduates();
}
