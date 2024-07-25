package lk.vau.fas.dps.Model;



import java.sql.Date;
import java.sql.Time;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name="session")
public class Session {
	@Id
	private String id;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String description ;
	private String name;
	@Temporal(TemporalType.TIME)
	private Time time;
	@JsonIgnore
	@ManyToMany(mappedBy="sessions")
	private List<Presenter> presenters;
	@JsonIgnore
	@ManyToMany(mappedBy="sessions")
	private List<Postgraduate> postgraduates;
	@JsonIgnore
	@ManyToMany(mappedBy="sessions")
	private List<Undergraduate> undergraduates;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="workshop_id")
	private Workshop workshop;
	
	public Session() {

	}

	public Session(String id, Date date, String description, String name, Time time) {
		this.id = id;
		this.date = date;
		this.description = description;
		this.name = name;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
}
