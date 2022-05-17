package overloading.overriding;

public class InterFaceD2 implements InterfaceD1 {
    int a;
    int b;
    InterFaceD2( int a, int b){
        this.a = a;
        this.b =b;
    }

    @Override
    public void m1() {
        int c = a+b;
        System.out.println("PRINT C:"+c);

    }

    @Override
    public void m2() {
        int d = a*b;
        System.out.println("PRINT D:"+d);

    }
    public static void main(String[] args) {
        InterFaceD2 im = new InterFaceD2(12,23);
        im.m1();
        im.m2();


    }
}

