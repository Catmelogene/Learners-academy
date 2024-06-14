package com.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="Subjects")
public class Subject {
	
	@Id
	@GeneratedValue
	private int subjectID;
	private String subjectName;
	private int credits;
	private int ClassID;
	
	
	
	/*
	 * @ManyToOne(targetEntity = Classes.class, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="classID") private Classes classes;
	 */

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getClassID() {
		return ClassID;
	}

	public void setClassID(int classID) {
		ClassID = classID;
	}
	
	/*
	 * public Classes getClasses() { return classes; }
	 * 
	 * public void setClasses(Classes classes) { this.classes = classes; }
	 */
}
