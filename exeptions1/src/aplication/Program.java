package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import models.entities.Reservation;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy):  ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-ot date (dd/MM/yyyy):");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error un reservation: Check-out date must be after check-in date");
        }else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter a data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy):  ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-ot date (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
        }



    }
}
