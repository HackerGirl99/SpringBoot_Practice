package lk.ac.vau.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class PostGraduate extends Person {
	private String secondDegree;
	private String institute;
	private String researchInterest;

	public PostGraduate() {

	}

	public PostGraduate(String id, String name, int phone, String email, String gender, List<Session> sessions,
			String degree, String university, String secondDegree, String institute, String researchInterest) {
		super(id, name, phone, email, gender, sessions, degree, university);
		this.secondDegree = secondDegree;
		this.institute = institute;
		this.researchInterest = researchInterest;
	}

	public String getSecondDegree() {
		return secondDegree;
	}

	public void setSecondDegree(String secondDegree) {
		this.secondDegree = secondDegree;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getResearchInterest() {
		return researchInterest;
	}

	public void setResearchInterest(String researchInterest) {
		this.researchInterest = researchInterest;
	}
}
