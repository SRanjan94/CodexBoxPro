// swaping integer and float using sccaner class
package assignement;
import java.util.Scanner;

public class SwapScanner {
    public static void main(String[] args){
        int i, j, temp;
        float a, b, temp2;

        //INTEGER

        Scanner s = new Scanner(System.in);
        System.out.println("put the int value:");
        i=s.nextInt();
        j=s.nextInt();

        System.out.println("before swap:"+i+" "+j);
                    temp=i;
                    i=j;
                    j=temp;
        System.out.println("value after swap:"+i+" "+j);

        //FLOAT

        Scanner s2 = new Scanner(System.in);
        System.out.println("put the float value");
                a=s2.nextFloat();
                b=s2.nextFloat();

        System.out.println("before swap:"+a+" "+b);
                temp2=a;
                a=b;
                b=temp;
        System.out.println("after swap:"+a+" "+b);
    }
}
