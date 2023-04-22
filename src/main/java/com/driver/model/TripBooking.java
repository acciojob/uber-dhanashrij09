package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "tripBooking")
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private int distanceInKm;
    private int bill;
    private String startLocation;
    private String endLocation;
    @Enumerated(value = EnumType.STRING)
    private TripStatus tripStatus;

    //mapping : parent--driver and child--tripBooking
    @ManyToOne
    @JoinColumn
    private Driver driver;

    //parent--customer and child -- tripBooking
    @ManyToOne
    @JoinColumn
    private Customer customer;

    public TripBooking(){

    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int id) {
        this.tripBookingId = id;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}