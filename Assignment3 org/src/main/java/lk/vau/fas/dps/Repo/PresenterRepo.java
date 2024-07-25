package lk.vau.fas.dps.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.vau.fas.dps.Model.Presenter;
@Repository
public interface PresenterRepo extends GenericRepo<Presenter, String>{
	@Query("select s.name from session s join presenter_sessions p where p.id = ?i")
	public List<String>findSessionTitle(String id);
}
