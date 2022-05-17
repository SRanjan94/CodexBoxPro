package overloading.overriding;

public class SuperMainCls {
    public static void main(String[] args) {
        Super sm = new Super1(1,"ankit",29000);
       // ((Super1) sm).display();
        sm.display();
    }
}
