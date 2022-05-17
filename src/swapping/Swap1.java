package swapping;

public class Swap1 {
    static void m1(int m,int n){
        int temp=m;
        m=n;
        n=temp;
        System.out.println("value of integer before swap:"+m+","+n);
    }
    static void m2(float f,float e) {
        float temp2=f;
        f=e;
        e=temp2;
        System.out.println("value of float before swap:"+f+","+e);
    }
    static void m3(double d, double c){
        double temp3=d;
        d=c;
        c=temp3;
        System.out.println("value of double before swap:"+d+","+c);
    }
    static void m4(long l,long o){
        long temp4=l;
        l=o;
        o=temp4;
        o=l;
        System.out.println("value of long before swap:"+l+","+o);
    }
    static void m5(char s,char t){
        char temp5=s;
        s=t;
        t=temp5;
        System.out.println("value of character before swap:"+s+","+t);
    }


    public static void main(String[] args){
       int  m=9;
       int  n=7;
       m1(m,n);
       System.out.println("value of integer after swap:"+m+","+n);

       float f=1.5f;
       float e=5.2f;
       m2(f,e);
        System.out.println("value of float after swap:"+f+","+e);

        double d=17.8;
        double c=11.99;
        m3(d,c);
        System.out.println("value of double after swap:"+d+","+c);

        long l=767557567;
        long o=28482347;
        m4(l,o);
        System.out.println("value of long after swap:"+l+","+o);

        char s='r';
        char t='n';
        m5(s,t);
        System.out.println("value of long after swap:"+s+","+t);



    }
}
