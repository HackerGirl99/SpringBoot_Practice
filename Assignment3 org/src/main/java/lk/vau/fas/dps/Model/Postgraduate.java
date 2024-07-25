package lk.vau.fas.dps.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="post_graduate")
public class Postgraduate {
	@Id
	private String id;
	private String email;
	private String gender;
	private String name;
	@Column(nullable = false)
	private int phone;
	private String institute;
	private String research_interest;
	private String second_degree;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name="post_graduate_sessions",
			joinColumns = @JoinColumn(name="post_graduates_id"),
			inverseJoinColumns =@JoinColumn(name="sessions_id")
	)
	private List<Session> sessions;
	
	public Postgraduate() {

	}

	public Postgraduate(String id, String email, String gender, String name, int phone, String institute,
			String research_interest, String second_degree) {
		this.id = id;
		this.email = email;
		this.gender = gender;
		this.name = name;
		this.phone = phone;
		this.institute = institute;
		this.research_interest = research_interest;
		this.second_degree = second_degree;
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

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getResearch_interest() {
		return research_interest;
	}

	public void setResearch_interest(String research_interest) {
		this.research_interest = research_interest;
	}

	public String getSecond_degree() {
		return second_degree;
	}

	public void setSecond_degree(String second_degree) {
		this.second_degree = second_degree;
	}
}
