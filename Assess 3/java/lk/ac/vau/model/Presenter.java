package lk.ac.vau.model;

import java.util.List;

import jakarta.persistence.Entity;
@Entity
public class Presenter extends Person {
	private String country;
	private String jobTitle;
	private String affliation;
	public Presenter() {
		
	}
	public Presenter(String id, String name, int phone, String email, String gender, List<Session> sessions,
			String degree, String university, String country, String jobTitle, String affliation) {
		super(id, name, phone, email, gender, sessions, degree, university);
		this.country = country;
		this.jobTitle = jobTitle;
		this.affliation = affliation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getAffliation() {
		return affliation;
	}
	public void setAffliation(String affliation) {
		this.affliation = affliation;
	}
	
}
