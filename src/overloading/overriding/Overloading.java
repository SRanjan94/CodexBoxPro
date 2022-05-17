package overloading.overriding;

public class Overloading {
   long cal(int a,float b) {

       return (long) (a + b);           //type casting
   }
   double cal(double d, int c){
       return d+c;
    }

    public static void main(String[] rgs){
    Overloading ol = new Overloading();
//    ol.cal();                 //no need to call here
    ol.cal(79.9,8);

      //  System.out.println(ol);       //error in print
        System.out.println(ol.cal(8,5.6f));
    }
}
