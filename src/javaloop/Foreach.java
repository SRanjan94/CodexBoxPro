package javaloop;

public class Foreach {
    public static void main(String[] args){
        int array[]={2,3,6,9,10,66,67};
        for(int arr:array ){
            if (arr>30){
                System.out.println("print arr:"+arr);
            }else
            System.out.println("warning");
        }

    }
}
