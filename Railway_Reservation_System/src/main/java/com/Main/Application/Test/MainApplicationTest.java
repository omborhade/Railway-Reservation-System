package com.Main.Application.Test;
import com.DOA.PassengerDAO;
import com.DOA.ReservationDAO;
import com.DOA.TrainDAO;
import com.entity.Passenger;
import com.entity.Reservation;
import com.entity.Train;

import jakarta.persistence.*;
public class MainApplicationTest {
	public static void main(String[] args) {
		Train train = new Train();
	    train.setName("Express123");

	    Passenger passenger = new Passenger();
	    passenger.setName("John Doe");
	    passenger.setTrain(train);

	    Reservation reservation = new Reservation();
	    reservation.setTrain(train);
	    reservation.setPassenger(passenger);

	    TrainDAO trainDAO = new TrainDAO();
	    trainDAO.saveOrUpdateTrain(train);

	    PassengerDAO passengerDAO = new PassengerDAO();
	    passengerDAO.saveOrUpdatePassenger(passenger);

	    ReservationDAO reservationDAO = new ReservationDAO();
	    reservationDAO.saveOrUpdateReservation(reservation);

	   
	}
		    

	}
		
	
	    


