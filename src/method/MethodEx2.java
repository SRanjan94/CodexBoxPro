package method;

public class MethodEx2 {
    public int m1(int a, int b){
//        MethodEx2 m = new MethodEx2();
        int sum=a+b;
        return sum;


    }

    public static void main(String[] args) {
        MethodEx2 m = new MethodEx2();
        int s = m.m1(54,78);
        System.out.println(s);
    }
}
