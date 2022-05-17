package stringtokenizer;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("practice coding make u perfect", " ");
        System.out.println("print:"+st.nextToken());
        System.out.println("print:"+st.nextToken());
        System.out.println("print:"+st.nextToken("."));
        System.out.println("print:"+st.countTokens());
        System.out.println("show me:"+st.hasMoreTokens());

        StringTokenizer st1 = new StringTokenizer("let's practice - every day");
        System.out.println("show me:"+st1.countTokens());
        System.out.println("show me:"+st1.hasMoreTokens());
        System.out.println("show me:"+st1.toString());
        System.out.println("show me:"+st1.hasMoreElements());
        System.out.println("show me:"+st1.nextElement());
        //System.out.println("show me:"+st1.hasMoreTokens());
       // System.out.println("show me:"+st1.hasMoreTokens());
        System.out.println("show me:"+st1.nextElement());
        System.out.println("show me:"+st1.equals(1));
        System.out.println("show me:"+st1.equals(5));

}
}
