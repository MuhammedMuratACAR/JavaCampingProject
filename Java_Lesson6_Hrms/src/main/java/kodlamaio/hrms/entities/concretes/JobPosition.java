package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")

public class JobPosition {
	@Id //PrimaryKey
	@GeneratedValue(strategy=GenerationType.IDENTITY) //AutoIncrement 
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
}
