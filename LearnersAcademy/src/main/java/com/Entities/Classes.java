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
@Table(name="Class")
public class Classes {
	
	@Id
	@GeneratedValue
	private int classID;
	private String ClassDesignation;
	private int Grade;
	private String RoomNo;
	/*
	 * @OneToMany(targetEntity = Subject.class, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="classID") private List<Subject> Subjects;
	 */

	
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getClassDesignation() {
		return ClassDesignation;
	}
	public void setClassDesignation(String classDesignation) {
		ClassDesignation = classDesignation;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(String roomNo) {
		RoomNo = roomNo;
	}
	
}
