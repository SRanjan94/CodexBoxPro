package stringbuffer;

public class StringBuilderP2 {
    public static void main(String[] args) {

        StringBuilder strb = new StringBuilder();
        strb= new StringBuilder("ram,nabin");

        char[] ch = new char[]{'M','n'};
       // strb.append(ch[] strb);
        System.out.println(strb);

       //  String[] sa = new String[]{"new","old"};
        StringBuilder sb3 = new StringBuilder("come to the box");
        sb3.append(1);
        sb3.append(" ");            // for space
        sb3.append(2.35);           // float value insert
        System.out.println("print float:"+sb3);


        sb3.append(" ");
        sb3.append(true);
        System.out.println("boolean value print:"+sb3);

      //  sb3.append(char[] c1);
        //  sb3.append('ch');

        StringBuilder sb4 = new StringBuilder("run all methods");
       // sb4.append(new Object());                         // showing error
       // System.out.println("print four builder:"+sb4.append(new Object()));

        sb4.insert(0,'P');          //insertion of char of intdex
        System.out.println("print insertion:"+sb4);

        sb4.deleteCharAt(0);
        System.out.println("printing after delet:"+sb4);

        System.out.println("length:"+sb4.length());

        sb4.insert(14, new String[]{"h", "o"});                 //error in char[] str //solve

        sb4.insert(3," &");
        System.out.println("print inser:"+sb4);

        sb4.insert(1,new char[] {'o','p','e','n'});
        System.out.println("print sb4 char:"+sb4);

        StringBuffer sbr1 = new StringBuffer("add new programm");
        //sbr1.
    }
}
