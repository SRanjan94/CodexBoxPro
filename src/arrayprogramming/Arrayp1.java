package arrayprogramming;
import java.util.*;
public class Arrayp1 {
    public int rollno;
    public String name;

    Arrayp1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

    }

    public static void main(String[] args) {

            Arrayp1[] a; //declaring array
            a = new Arrayp1[5];
            a[0] = new Arrayp1(1, "rocky");
            a[1] = new Arrayp1(2, "smruti");
            a[2] = new Arrayp1(3, "ranjan");
            a[3] = new Arrayp1(4, "sethi");
            a[4] = new Arrayp1(5, "Rsethi");


        for (int i = 0; i < a.length; i++) {
                System.out.println("elements" + i + ":" + a[i].rollno + " " + a[i].name);
            }

        }

    }
