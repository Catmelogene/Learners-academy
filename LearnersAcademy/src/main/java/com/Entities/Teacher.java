package com.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {
	
	@Id
	@GeneratedValue
	private int teacherID;
	private String FirstName;
	private String LastName;
	private String Office;
	private String OfficeNumber;
	private String Email;
	@OneToMany(targetEntity = Classes.class, cascade = CascadeType.ALL)
	@JoinColumn(name="cusid")
	private List<Classes>  Classes;
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getOffice() {
		return Office;
	}
	public void setOffice(String office) {
		Office = office;
	}
	public String getOfficeNumber() {
		return OfficeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		OfficeNumber = officeNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<Classes> getClasses() {
		return Classes;
	}
	public void setClasses(List<Classes> classes) {
		Classes = classes;
	}

	

}
