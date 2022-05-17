package string;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringD7 {
    public static void main(String[] args){
        String s1=new String("ram");
        String s2=new String("nabin");
        String s3=new String("kapil");

        System.out.println("print:"+s1.toUpperCase());
        if(s1.length()==4 || s2.length()==9) {
            System.out.println("print s1:"+s1);
        }else{
            System.out.println("print false");
        }


    }
}
