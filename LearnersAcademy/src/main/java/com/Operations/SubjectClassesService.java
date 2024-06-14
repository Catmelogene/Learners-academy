package com.Operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Connections.DbConnection;
import com.Entities.Classes;
import com.Entities.Subject;
import com.Entities.Subject_Classes;

import jakarta.persistence.TypedQuery;

public class SubjectClassesService {
	
	SessionFactory sfact = null;
	
	public SubjectClassesService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void PairClassSubject(Subject_Classes pair)
	{
		Session session = sfact.openSession();
		Transaction transact = session.beginTransaction();
		session.persist(pair);
		transact.commit();
	}
	
	public List<Subject_Classes>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery query = session.createQuery("from Subject_Classes");
		List<Subject_Classes> pairlist = query.getResultList();
		return pairlist;
	}
	 public Classes getClass(int id) { 
		 Session session = sfact.openSession();
		 Classes clss = session.get(Classes.class, id); 
		 session.close(); 
		 return clss;
	 }
	 
	 public Subject getSubject(int id) { 
		 Session session = sfact.openSession();
		 Subject sub = session.get(Subject.class, id); 
		 session.close(); 
		 return sub;
	 }

}
