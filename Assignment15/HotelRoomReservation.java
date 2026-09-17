import java.util.Scanner;

class Room {
    int number;
    String type;
    boolean booked;

    Room(int number, String type) {
        this.number = number;
        this.type = type;
        booked = false;
    }
}

class RoomNotAvailableException extends Exception {
    RoomNotAvailableException(String msg) {
        super(msg);
    }
}

public class HotelRoomReservation {

    static void book(Room r) throws RoomNotAvailableException {
        if (r.booked)
            throw new RoomNotAvailableException(
                "Room " + r.number + " is already booked."
            );

        r.booked = true;
        System.out.println(
            "Room " + r.number + " (" + r.type + ") booked successfully."
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
            new Room(101, "Standard"),
            new Room(102, "Standard"),
            new Room(201, "Deluxe"),
            new Room(202, "Deluxe")
        };

        int free = 4;

        System.out.println("===== Hotel Room Reservation System =====");

        for (int i = 0; i < 4; i++) {

            System.out.println("\n===== Case " + (i + 1) + ": Successful Booking =====");
            System.out.print("Enter room number to book: ");
            int n = sc.nextInt();

            try {
                for (Room r : rooms) {
                    if (r.number == n) {
                        book(r);
                        free--;
                        break;
                    }
                }
            } catch (RoomNotAvailableException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Rooms still free: " + free);
                System.out.println("Booking check completed.");
            }
        }

        System.out.println("\n===== Case 5: Room Already Booked =====");

        try {
            book(rooms[0]);
        } catch (RoomNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Rooms still free: " + free);
            System.out.println("Booking check completed.");
        }

        System.out.println("\nAvailable Rooms:");

        for (Room r : rooms) {
            if (!r.booked)
                System.out.println(r.number + " - " + r.type);
        }

        sc.close();
    }
}