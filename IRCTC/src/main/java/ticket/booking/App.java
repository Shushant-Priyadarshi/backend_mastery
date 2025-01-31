package ticket.booking;

import ticket.booking.service.UserBooking;

import java.io.IOException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        System.out.println("***************** Running Train Booking Application *****************");
        Scanner scanner = new Scanner(System.in);
        int option=0;
        UserBooking  userBookingService;
        try{
            userBookingService = new UserBooking();
        }catch (IOException e){
            System.out.println("There was something went wrong!!");
            return;
        }
    }
}
