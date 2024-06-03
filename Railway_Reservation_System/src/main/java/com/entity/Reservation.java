package com.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "reservations")
public class Reservation {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "reservation_id")
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "train_id")
	    private Train train;

	    @ManyToOne
	    @JoinColumn(name = "passenger_id")
	    private Passenger passenger;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Train getTrain() {
			return train;
		}

		public void setTrain(Train train) {
			this.train = train;
		}

		public Passenger getPassenger() {
			return passenger;
		}

		public void setPassenger(Passenger passenger) {
			this.passenger = passenger;
		}

	    // Constructors, getters, and setters
	}


