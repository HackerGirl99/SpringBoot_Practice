package lk.ac.vau.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Session {
	@Id
	private String id;
	private String name;
	private String describtion;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Time time;
	@ManyToOne
	private Workshop workshop;
	@JsonIgnore
	@ManyToMany(mappedBy = "sessions")
	private List<UnderGraduate> underGraduates;
	@JsonIgnore
	@ManyToMany(mappedBy = "sessions")
	private List<PostGraduate> postGraduates;
	@JsonIgnore
	@ManyToMany(mappedBy = "sessions")
	private List<Presenter> presenters;

	public Session() {

	}

	public Session(String id, String name, String describtion, Date date, Time time, Workshop workshop,
			List<UnderGraduate> underGraduates, List<PostGraduate> postGraduates, List<Presenter> presenters) {
		this.id = id;
		this.name = name;
		this.describtion = describtion;
		this.date = date;
		this.time = time;
		this.workshop = workshop;
		this.underGraduates = underGraduates;
		this.postGraduates = postGraduates;
		this.presenters = presenters;
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

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Workshop getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public List<UnderGraduate> getUnderGraduates() {
		return underGraduates;
	}

	public void setUnderGraduates(List<UnderGraduate> underGraduates) {
		this.underGraduates = underGraduates;
	}

	public List<PostGraduate> getPostGraduates() {
		return postGraduates;
	}

	public void setPostGraduates(List<PostGraduate> postGraduates) {
		this.postGraduates = postGraduates;
	}

	public List<Presenter> getPresenters() {
		return presenters;
	}

	public void setPresenters(List<Presenter> presenters) {
		this.presenters = presenters;
	}
}
