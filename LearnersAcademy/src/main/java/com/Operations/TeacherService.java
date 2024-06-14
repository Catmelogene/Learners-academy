package com.Operations;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import jakarta.persistence.TypedQuery;

import com.Connections.DbConnection;
import com.Entities.Teacher;

public class TeacherService {

SessionFactory sfact = null;
	
	public TeacherService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void Add(Teacher teach)
	{
		Session session = sfact.openSession();
		Transaction transact = session.beginTransaction();
		session.persist(teach);
		transact.commit();
	}
	
	public List<Teacher>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery query = session.createQuery("from Teacher");
		List<Teacher> teachlist = query.getResultList();
		return teachlist;
	}
	
	public Teacher SearchTeacher(int id)
	{
		Session session = sfact.openSession();
		Teacher teach = session.get(Teacher.class, id);
		return teach;
	}
}
