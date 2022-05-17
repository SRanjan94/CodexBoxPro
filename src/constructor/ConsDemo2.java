package constructor;

public class ConsDemo2 {
    int m;
    String s;

    ConsDemo2(int m, String s) {
        this.m = m;
        this.s = s;
    }
//}
     //   class Consd{
        public static void main(String[] args) {
         ConsDemo2 cd2 = new ConsDemo2(5, "smruti");
         ConsDemo2 cd3 = new ConsDemo2(6, "ranjan");
         ConsDemo2 cd4 = new ConsDemo2(7, "sethi");

       // ConsDemo2.cd2;
//      if(cd2.m==3 || cd3.s.equals("ranjan")){
        System.out.println(cd2.m + " " + cd2.s);
        System.out.println(cd3.m + " " + cd3.s);
        System.out.println(cd4.m + " " + cd4.s);
    }
}

