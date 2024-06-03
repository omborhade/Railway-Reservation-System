package com.DOA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Utility.UtilityClass;
import com.entity.Reservation;

public class ReservationDAO {
	 private SessionFactory sessionFactory;

	    public void saveOrUpdateReservation(Reservation reservation) {
	    	 try (Session session = sessionFactory.openSession()) {
	              Transaction transaction = session.beginTransaction();
	              session.save(reservation);
	              transaction.commit();
	          }
	    }

		public ReservationDAO() {
			super();
			this.sessionFactory =  UtilityClass.getSessionFactory();
		}

}
