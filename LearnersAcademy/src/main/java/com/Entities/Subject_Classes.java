package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Subject_Class")
public class Subject_Classes {
	
	@Id
	@GeneratedValue
	private int ID;
	private int SubjectId;
	private int ClassesId;
	
	public Subject_Classes(){
		
	}
	
	public Subject_Classes( int subjectId, int classesId) {
		super();
		this.SubjectId = subjectId;
		this.ClassesId= classesId;
	}
	public int getId() {
		return ID;
	}
	public void setId(int id) {
		ID = id;
	}
	public int getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}
	public int getClassesId() {
		return ClassesId;
	}
	public void setClassesId(int classesId) {
		ClassesId = classesId;
	}
	
	
}
