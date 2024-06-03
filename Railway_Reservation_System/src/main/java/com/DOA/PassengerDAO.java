package com.DOA;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Utility.UtilityClass;
import com.entity.Passenger;

import jakarta.persistence.*;

public class PassengerDAO {
	private SessionFactory sessionFactory;

    public void saveOrUpdatePassenger(Passenger passenger) {
    	 try (Session session = sessionFactory.openSession()) {
             Transaction transaction = session.beginTransaction();
             session.save(passenger);
             transaction.commit();
         }
    }

	public PassengerDAO() {
		super();
		this.sessionFactory =  UtilityClass.getSessionFactory();
	}
}
