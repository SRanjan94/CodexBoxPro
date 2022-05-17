package arrayprogramming;

public class SimpleArray {
    public static void main(String[] args){
        int[] a;
        a=new int[5];
        a[0]=5;
        a[1]=7;
        a[2]=15;
        a[3]=2;
        for (int i=0; i< a.length; i++){
            System.out.println("element"+i+":"+a[i]);
        }
    }
}
