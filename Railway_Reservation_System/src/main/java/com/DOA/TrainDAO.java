package com.DOA;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Utility.UtilityClass;
import com.entity.Train;


import jakarta.persistence.*;


public class TrainDAO {
    private SessionFactory sessionFactory;

    public void saveOrUpdateTrain(Train train) {
    	  try (Session session = sessionFactory.openSession()) {
              Transaction transaction = session.beginTransaction();
              session.save(train);
              transaction.commit();
          }
    }

	public TrainDAO() {
		super();
		this.sessionFactory = UtilityClass.getSessionFactory();
	}


}
