package lk.vau.fas.dps.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="under_graduate")
public class Undergraduate {
	@Id
	private String id;
	private String email;
	private String gender;
	private String name;
	@Column(nullable = false)
	private int phone;
	private String degree;
	private String university;
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name="under_graduate_sessions",
			joinColumns = @JoinColumn(name="under_graduates_id"),
			inverseJoinColumns =@JoinColumn(name="sessions_id")
	)
	private List<Session> sessions;
	
	public Undergraduate() {

	}

	public Undergraduate(String id, String email, String gender, String name, int phone, String degree,
			String university) {
		this.id = id;
		this.email = email;
		this.gender = gender;
		this.name = name;
		this.phone = phone;
		this.degree = degree;
		this.university = university;
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
