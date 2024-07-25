package lk.vau.fas.dps.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="presenter")
public class Presenter {
	@Id
	private String id;
	private String email;
	private String gender;
	private String name;
	@Column(nullable = false)
	private int phone;
	private String affiliation ;
	private String country;
	private String job_title;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name="presenter_sessions",
			joinColumns = @JoinColumn(name="presenters_id"),
			inverseJoinColumns =@JoinColumn(name="sessions_id")
	)
	private List<Session> sessions;
	
	public Presenter() {
		
	}

	public Presenter(String id, String email, String gender, String name, int phone, String affiliation, String country,
			String job_title) {
		this.id = id;
		this.email = email;
		this.gender = gender;
		this.name = name;
		this.phone = phone;
		this.affiliation = affiliation;
		this.country = country;
		this.job_title = job_title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
}