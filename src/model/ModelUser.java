package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Application_USER")
public class ModelUser {

	@Id
	@Column(name="ID")
	Integer id;
	@Column(name="Firstname")
	String firstname;
	@Column(name="Lastname")
	String lastname;
	@Column(name="Email")
	String email;
	@Column(name="Password")
	String password;
	@Column(name="Id_Role")
	Integer id_role;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getId_role() {
		return id_role;
	}
	
	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}
	
	@Override
	public String toString() {
		return "ModelUser [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", id_role=" + id_role + "]";
	}
}
