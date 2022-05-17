package assignment.week2;

import java.util.Scanner;

public class PassengerDetails extends RailReservSystem {
   void passenger(){
        Scanner sc2 = new Scanner(System.in);
       System.out.println("Print the passenger details:");

       System.out.println("enter Name:");
       String name = sc2.next();

       System.out.println("enter Age:");
       int age = sc2.nextInt();

       System.out.println("enter Gender:");
       String gender = sc2.next();

       System.out.println("enter Gmail:");
       String mail = sc2.next();

       System.out.println("enter MobileNo:");
       long mobileno = sc2.nextLong();

       System.out.println("enter Address:");
       String address = sc2.next();
       // System.out.println("Name:"+name+" "+"Age:"+age+" "+"Address:"+address);
       //System.out.println(name+" "+age+" "+address);

    }

}
