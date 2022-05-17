package overloading.overriding;

public class OverLoading2 {
   void example(){
    }
    int example(int u, int m){
       return u*m;
    }
}
        class OverLoad2 extends Overloading{
            public static void main(String[] args) {
                OverLoad2 ol2 = new OverLoad2();
              // ol2.example();                 //can't resolve .example() as it is not inside the main method
                                                // not overloading not overriding
                  //  System.out.println(ol2.example());
            }
        }