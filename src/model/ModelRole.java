package model;

import javax.persistence.*;

@Entity
@Table(name="Application_Role")
public class ModelRole {

	@Id
	@Column(name = "ID")
	int id;
	
	@Column(name = "Name")
	String name;
	
	@Column(name = "Description")
	String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ModelRole [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
