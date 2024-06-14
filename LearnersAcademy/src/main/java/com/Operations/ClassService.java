package com.Operations;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import jakarta.persistence.TypedQuery;

import com.Connections.DbConnection;
import com.Entities.Classes;

public class ClassService {

SessionFactory sfact = null;
	
	public ClassService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void Add(Classes clss)
	{
		Session session = sfact.openSession();
		Transaction transact = session.beginTransaction();
		session.persist(clss);
		transact.commit();
	}
	
	public List<Classes>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery query = session.createQuery("from Classes");
		List<Classes> clsslist = query.getResultList();
		return clsslist;
	}
	
	public Classes SearchClass(int id)
	{
		Session session = sfact.openSession();
		Classes clss = session.get(Classes.class, id);
		return clss;
	}
	
	public Classes getClassById(int id) {
		Session session = sfact.openSession();
		return session.get(Classes.class, id);
	}
}
