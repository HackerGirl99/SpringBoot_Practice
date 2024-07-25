package lk.ac.vau.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class UnderGraduate extends Person {
	private String degree;
	private String university;

	public UnderGraduate() {

	}

	public UnderGraduate(String id, String name, int phone, String email, String gender, List<Session> sessions,
			String degree, String university) {
		super(id, name, phone, email, gender, sessions, degree, university);
		this.degree = degree;
		this.university = university;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}
