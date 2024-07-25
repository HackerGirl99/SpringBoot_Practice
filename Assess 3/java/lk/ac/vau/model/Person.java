package lk.ac.vau.model;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	@Id
	private String id;
	private String name;
	private int phone;
	private String email;
	private String gender;
	@ManyToMany
	private List<Session> sessions;

	public Person() {

	}

	public Person(String id, String name, int phone, String email, String gender, List<Session> sessions, String degree, String university) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.sessions = sessions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
}
