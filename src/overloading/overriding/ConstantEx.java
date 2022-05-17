package overloading.overriding;

public class ConstantEx {
   public static final int EMPID = 202294;
        // int EMPID = 2344;
    void con() {

       System.out.println("show previous value: "+EMPID);

    }
    public static final int EMPID2 = 22094;
  //   public static int  EMPID2 = 232343;
    public static void main(String[] args) {
        final int EMPID2 = 22094;

        // EMPID2 = 2344;

        ConstantEx ce = new ConstantEx();
        ce.con();

       // int empid2 = ce.EMPID2;

        System.out.println("present value: "+EMPID2);

    }
}

