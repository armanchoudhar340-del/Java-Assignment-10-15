# Assignment 15 - Hotel Room Reservation System (Mini Project)

## Problem Statement
Design and implement a **Hotel Room Reservation System** in Java that demonstrates the use of **custom exception handling**, **object-oriented programming**, and **user interaction** through a console-based interface.

## Concepts Used
- **Classes and Objects** (`Room`, `HotelRoomReservation`)
- **Custom Exception** (`RoomNotAvailableException`)
- **Exception Handling** (`try-catch-finally`)
- **Arrays** for managing room inventory
- **Scanner** for user input

## How It Works
1. The system initializes 4 rooms (2 Standard: 101, 102 and 2 Deluxe: 201, 202).
2. The user is prompted to enter a room number to book across 4 booking cases.
3. If the room is available, it is booked successfully.
4. If the room is already booked, a `RoomNotAvailableException` is thrown and caught.
5. A 5th case automatically tries to re-book Room 101 to demonstrate exception handling.
6. Finally, the system displays all remaining available rooms.

## How to Run
```bash
javac HotelRoomReservation.java
java HotelRoomReservation
```

## Sample Output
```
===== Hotel Room Reservation System =====

===== Case 1: Successful Booking =====
Enter room number to book: 101
Room 101 (Standard) booked successfully.
Rooms still free: 3
Booking check completed.

===== Case 5: Room Already Booked =====
Error: Room 101 is already booked.
Rooms still free: 0
Booking check completed.
```
