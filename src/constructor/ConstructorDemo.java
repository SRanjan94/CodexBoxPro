package constructor;
//no argument constructor

public class ConstructorDemo {
    int x;
    int y;

    ConstructorDemo(){
        System.out.println("call constructor");

    }

    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        System.out.println(cd.x);
        System.out.println(cd.y);
    }
}
