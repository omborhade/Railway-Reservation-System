package com.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "passengers")
public class Passenger {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "passenger_id")
	    private Long id;

	    @Column(name = "passenger_name")
	    private String name;

	    @ManyToOne
	    @JoinColumn(name = "train_id")
	    private Train train;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Train getTrain() {
			return train;
		}

		public void setTrain(Train train) {
			this.train = train;
		}

	    
	}


