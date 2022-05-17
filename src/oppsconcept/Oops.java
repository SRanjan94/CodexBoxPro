package oppsconcept;

public class Oops {
    public static void main(String[] args) {
        Sedan a1 = new Sedan();

      a1.setPrice(1234);
      a1.setTax(399);
      int totalp= a1.getPrice()+ a1.getTax();

      System.out.println("print total:"+totalp);


      // Sedan a11 = new Sedan(1500000,182000 );
       /* if (a11 > 2000000){
            a11.m1();
        }else
            a11.m2();*/


        Xuv a2 = new Xuv("valved");

        while(a2.equals("red")){
            a2.m1();
        }
        System.out.println("print wrong colour in m1() ");

        a2.m2();


    }
}
