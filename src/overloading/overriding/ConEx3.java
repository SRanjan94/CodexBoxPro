package overloading.overriding;

public class ConEx3 extends ConEx2 {
    static final long CAMPRICE2 = 99999;

    void printprice() {


    }

    public static void main(String[] args) {
        ConEx2 ce = new ConEx3();
        ce.printprice();
       /* if (ce.) {
            System.out.println("new price:" + CAMPRICE2);

        } else
            System.out.println(" error ");*/
    }
}
