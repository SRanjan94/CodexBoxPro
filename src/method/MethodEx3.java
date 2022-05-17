package method;

import java.util.Scanner;

public class MethodEx3 {
   static void m1(int age){
       if (age < 18){
           System.out.println("access denied");
       }else{
           System.out.println("access granted");
       }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("print the age:");

       int age1 = sc.nextInt();
       m1(age1);
        System.out.println(age1);

    }
}
