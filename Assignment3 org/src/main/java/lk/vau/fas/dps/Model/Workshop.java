package lk.vau.fas.dps.Model;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name="workshop")
public class Workshop {
	@Id
	private int id;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date end_date;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@JsonIgnore
	@OneToMany(mappedBy="workshop")
	private List<Session> sessions;  
	
	public Workshop() {

	}

	public Workshop(int id, String description, Date end_date, String name, Date start_date) {
		this.id = id;
		this.description = description;
		this.end_date = end_date;
		this.name = name;
		this.start_date = start_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
}