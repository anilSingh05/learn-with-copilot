package org.example.hms;

// Hotel class with properties name, address, and rooms (List<Room>), reservations (List<Reservation>), and revenue (double)

import java.util.List;

public class Hotel {
    private String name;
    private String address;
    private List<Room> rooms;
    private List<Reservation> reservations;
    private double revenue;

    public Hotel(String name, String address, List<Room> rooms, List<Reservation> reservations, double revenue) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
        this.reservations = reservations;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
