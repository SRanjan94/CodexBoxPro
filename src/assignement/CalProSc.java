package assignement;

import java.util.Scanner;

public class CalProSc {
    public static void main(String [] args){
        int no1, no2, rsl = 0;
        char op;
        Scanner s = new Scanner(System.in);
        System.out.println("put the int value:");
        no1=s.nextInt();
        no2=s.nextInt();
        System.out.println("put the operator:");
        op=s.next().charAt(0);
        switch (op){
            case '+':rsl=no1+no2;
            break;
            case '-': rsl=no1-no2;
            break;
            case '*': rsl=no1*no2;
            break;
            case '/': rsl=no1/no2;
            break;
            default:
                System.out.println("error");
                break;
        }
        System.out.println("result:"+no1+" "+op+" "+no2+"="+rsl);


    }
}
