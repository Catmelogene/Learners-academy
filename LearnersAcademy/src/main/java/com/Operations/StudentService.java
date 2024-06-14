package com.Operations;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import jakarta.persistence.TypedQuery;

import com.Connections.DbConnection;
import com.Entities.Student;

public class StudentService {

SessionFactory sfact = null;
	
	public StudentService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void AddStudent(Student dent)
	{
		Session session = sfact.openSession();
		Transaction transact = session.beginTransaction();
		//Student clss=new Student();
		//sub.setClasses(clss);
		session.persist(dent);
		transact.commit();
	}
	
	public List<Student>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery query = session.createQuery("from Student");
		List<Student> dentlist = query.getResultList();
		return dentlist;
	}
	
	public Student SearchStudent(int id)
	{
		Session session = sfact.openSession();
		Student dent = session.get(Student.class, id);
		return dent;
	}

	
}
