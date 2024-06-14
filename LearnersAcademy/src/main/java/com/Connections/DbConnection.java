package com.Connections;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {
	
	public static SessionFactory getConnection()
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sfact = config.buildSessionFactory();
		return sfact;
	}


}
