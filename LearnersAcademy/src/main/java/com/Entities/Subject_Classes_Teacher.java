package com.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name="Subject_Class_Teacher")
public class Subject_Classes_Teacher {
	
	@Id
	@GeneratedValue
	private int Id;
	private int SubjectId;
	private int ClassesId;
	private int TeacherId;
	
	public Subject_Classes_Teacher() {
		
	}
	
	public Subject_Classes_Teacher(int id, int subjectId, int classesId, int teacherId) {
		super();
		Id = id;
		SubjectId = subjectId;
		ClassesId = classesId;
		TeacherId = teacherId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public int getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}
	
	
}
