package com.Operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Connections.DbConnection;
import com.Entities.Classes;
import com.Entities.Subject;
import com.Entities.Subject_Classes_Teacher;

import jakarta.persistence.TypedQuery;

public class AllocationService {
	
	SessionFactory sfact = null;
	
	public AllocationService(int subjectId, int classId, int teacherId)
	{
		sfact = DbConnection.getConnection();
	}
	
	public void Allocate(Subject_Classes_Teacher all)
	{
		Session session = sfact.openSession();
		Transaction transact = session.beginTransaction();
		session.persist(all);
		transact.commit();
	}
	
	public List<Subject_Classes_Teacher>  List()
	{
		Session session = sfact.openSession();
		TypedQuery query = session.createQuery("from Subject_Classes_Teacher");
		List<Subject_Classes_Teacher> pairlist = query.getResultList();
		return pairlist;
	}
	
	

}
