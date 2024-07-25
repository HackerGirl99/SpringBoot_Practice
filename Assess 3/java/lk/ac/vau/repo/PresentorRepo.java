package lk.ac.vau.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.model.Presenter;
@Repository
public interface PresentorRepo extends GenericRepo<Presenter, String> {
	@Query("select s.name from Presenter p join p.sessions s where p.id =?1")
	public List<String>SessionNames(String id);

}
