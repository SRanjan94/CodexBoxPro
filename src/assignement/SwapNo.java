package assignement;

import java.sql.SQLOutput;

public class SwapNo {
    /*public static void m1(){
     int n=10, m=20;
          int temp;
        float a=2.3f, b=5.9f, temp2;*/



   public static void main(String[] args){
       int n=10, m=20, temp;;
       float a=2.3f, b=5.9f, temp2;


       System.out.println("print before:"+a+","+" "+b);

       temp2=a;
       a=b;
       b=temp2;
       System.out.println("print after:"+a+","+" "+b);


       System.out.println("before swap:"+m+","+" "+n);
       temp=m;
       m=n;
       n=temp;

       System.out.println("after swap:"+m+","+" "+n);





    }
}
