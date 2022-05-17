package javaloop;

public class Continue {
public static void main(String[] args){
    for(int i=0; i<=20; i++){
        if(i==12 || i==15){
            continue;
        }
        System.out.println("print i:" +i);
    }
}
}
