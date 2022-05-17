package stringbuffer;

public class StringBufferP2 {
    public static void main(String[] args) {


        StringBuffer sb1 = new StringBuffer("sam");
        sb1.insert(0, "mohan");
        System.out.println(sb1);

        sb1.replace(0,1,"1M");
        System.out.println(sb1);

        sb1.append(98);
        System.out.println(sb1);

        sb1.delete(9,11);
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("kakatpoli");


        System.out.println("charat:"+sb2.charAt(0));


        System.out.println("length:"+sb2.length());


        System.out.println("substring:"+sb2.substring(1));


        System.out.println("print substring:"+sb2.substring(2,3));


        System.out.println("capacity:"+sb1.capacity());
    }
}