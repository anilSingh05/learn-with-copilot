package org.example.hms;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to HMS !");

        Room room1 = new Room(101, "Single", false);
        Room room2 = new Room(102, "Double", true);
        Room room3 = new Room(103, "Single", false);

        Hotel hotel = new Hotel("The Grand Hotel", "1234 Grand Ave",
                List.of(room1, room2, room3), new ArrayList<>(), 0.0);

        Scanner scanner = new Scanner(System.in);

        // create while loops that will keep running until the user decides to exit
        while (true) {
            System.out.println("1. Check availability");
            System.out.println("2. Make a reservation");
            System.out.println("3. Check out");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Available rooms:");
                for (Room room : hotel.getRooms()) {
                    if (!room.isOccupied()) {
                        System.out.println(room.getNumber() + " - " + room.getType());
                    }
                }
            } else if (choice == 2) {
                System.out.print("Enter room number: ");
                int roomNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter guest name: ");
                String guestName = scanner.nextLine();
                System.out.print("Enter guest phone number: ");
                String guestPhoneNumber = scanner.nextLine();
                System.out.print("Enter number of guests: ");
                int noOfGuest = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter check-in date: ");
                String checkIn = scanner.nextLine();
                System.out.print("Enter check-out date: ");
                String checkOut = scanner.nextLine();

                Room selectedRoom = null;
                for (Room room : hotel.getRooms()) {
                    if (room.getNumber() == roomNumber) {
                        selectedRoom = room;
                        break;
                    }
                }

                if (selectedRoom == null) {
                    System.out.println("Invalid room number");
                } else if (selectedRoom.isOccupied()) {
                    System.out.println("Room is already occupied");
                } else {
                    selectedRoom.setOccupied(true);
                    hotel.getReservations().add(new Reservation(hotel.getReservations().size() + 1, selectedRoom, guestName, guestPhoneNumber, noOfGuest, checkIn, checkOut));
                    System.out.println("Reservation successful");
                }
            } else if (choice == 3) {
                System.out.print("Enter room number: ");
                int roomNumber = scanner.nextInt();
                scanner.nextLine();

                Room selectedRoom = null;
                for (Room room : hotel.getRooms()) {
                    if (room.getNumber() == roomNumber) {
                        selectedRoom = room;
                        break;
                    }
                }

                if (selectedRoom == null) {
                    System.out.println("Invalid room number");
                } else if (!selectedRoom.isOccupied()) {
                    System.out.println("Room is not occupied");
                } else {
                    selectedRoom.setOccupied(false);
                    for (Reservation reservation : hotel.getReservations()) {
                        if (reservation.getRoom().getNumber() == roomNumber) {
                            hotel.setRevenue(hotel.getRevenue() + 100.0);
                            hotel.getReservations().remove(reservation);
                            break;
                        }
                    }
                    System.out.println("Check out successful");
                }
            }
        }
    }
}