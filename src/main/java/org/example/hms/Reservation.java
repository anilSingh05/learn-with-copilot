package org.example.hms;

// Reservation class with properties id, room, guestName, guestPhoneNumber, noOfGuest, checkIn, and checkOut

public class Reservation {
    private int id;
    private Room room;
    private String guestName;
    private String guestPhoneNumber;
    private int noOfGuest;
    private String checkIn;
    private String checkOut;

    public Reservation(int id, Room room, String guestName, String guestPhoneNumber, int noOfGuest, String checkIn, String checkOut) {
        this.id = id;
        this.room = room;
        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.noOfGuest = noOfGuest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public int getNoOfGuest() {
        return noOfGuest;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }
}
