package com.Operations;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import jakarta.persistence.TypedQuery;

import com.Connections.DbConnection;
import com.Entities.Subject;

public class SubjectService {

SessionFactory sfact = null;
	
	public SubjectService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void AddSubject(Subject sub)
	{
		Session session = sfact.openSession();
		Transaction transact = session.beginTransaction();
		//Classes clss=new Classes();
		//sub.setClasses(clss);
		session.persist(sub);
		transact.commit();
	}
	
	public List<Subject>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery query = session.createQuery("from Subject");
		List<Subject> subjectlist = query.getResultList();
		return subjectlist;
	}
	
	public Subject SearchSubject(int id)
	{
		Session session = sfact.openSession();
		Subject sub = session.get(Subject.class, id);
		return sub;
	}
	 
}
