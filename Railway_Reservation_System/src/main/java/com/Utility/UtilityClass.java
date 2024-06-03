package com.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilityClass {
	private static final SessionFactory sessionFactory;

	static {
		try {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
