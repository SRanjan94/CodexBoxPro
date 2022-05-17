package stringbuffer;

public class StringUsingMethod {
    public static void main(String [] args){
        StringBuffer sb1 = new StringBuffer("change the box");
        sb1.append('i');

        System.out.println( "length of text:"+sb1.length());
        System.out.println("print the text after append:"+sb1);

        System.out.println( "length of text:"+sb1.length());

        sb1.deleteCharAt(14);
        System.out.println("print sb1 after delete charat:"+sb1);


        System.out.println("print :"+sb1.lastIndexOf("b"));

        System.out.println("print :"+sb1.lastIndexOf("sa"));

                StringBuilder sb2 = new StringBuilder();
                String[] sa=new String[]{"c1,c2,c3"};

        System.out.println(sb2.append(sa));


    }

}
