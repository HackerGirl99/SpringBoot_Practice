package lk.vau.fas.dps.Repo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.vau.fas.dps.Model.Session;
@Repository
public interface SessionRepo extends GenericRepo<Session, String>{
	@Query("select count(s.id) from session s join presenter_sessions p on s.id = p.id join under_graduate_sessions u on s.id=u.id join post_graduate_sessions g on s.id = g.id where s.id = ?1")
	public Integer findSessionCount(String id);
}
