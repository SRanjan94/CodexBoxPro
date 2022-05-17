package javaloop;

public class BreakSts {
    public static void main(String[] args){
        int i = 1;
        for (i=0; i<15; i++){
            if(i==4)
                break;
            System.out.println("print i:"+i);
        }
    }

}
