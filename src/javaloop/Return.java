package javaloop;

public class Return {
    int m1(int a, int b){
        int sum=0;
        sum=a+b;
        return sum;
    }


    public static void main(String[] args){
        System.out.println(new Return().m1(5,7));
    }
}
