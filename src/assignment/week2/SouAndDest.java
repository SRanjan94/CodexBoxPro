package assignment.week2;

import java.util.Scanner;

public class SouAndDest {
    void fare1(){
        String loc;
        System.out.println("Enter the destination location(choose from Bbs,Hyd,Sc,Vijag):");
        Scanner sc3 = new Scanner(System.in);
        loc = sc3.next();
            switch (loc){
                case "Bbs":
                    System.out.println("Sleeper:"+390);
                    System.out.println("3rd Ac:"+630);
                    break;
                case "Hyd":
                    System.out.println("Sleeper:"+560);
                    System.out.println("3rd Ac:"+900);
                    break;
                case "Sc":
                    System.out.println("Sleeper:"+340);
                    System.out.println("3rd Ac:"+570);
                    break;
                case "Vijag":
                    System.out.println("Sleeper:"+260);
                    System.out.println("3rd Ac:"+710);
                    break;
            }
        System.out.println("enter the Amount:");
            int accbal = sc3.nextInt();
            accbal = 2000;


            /*if(accbal==390 || accbal==630 || accbal==560 || accbal==900 ||
                    accbal==340 || accbal==570 || accbal==260 || accbal==710){
                System.out.println("Ticket is confirmed");
            }else{
                System.out.println("Ticket is cancel");
                System.out.println("Enter the right amount:");
            }*/
    }
}
