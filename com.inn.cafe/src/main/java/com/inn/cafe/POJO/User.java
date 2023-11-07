package com.inn.cafe.POJO;
//import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.io.Serializable;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@NamedQuery(name="User.findByEmailId",query="select u from User u where u.email=:email")
//@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="contactNumber")
	private String contactNumber;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="status")
	private String status;
	@Column(name="role")
	private String role;
	
	public User(Integer id, String name, String contactNumber, String email, String password, String status,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
		this.status = status;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
//	public void setContactNumber(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setName(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setEmail(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setPassword(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setStatus(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setRole(String string) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
