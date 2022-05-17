//using valueOf()
package string;

public class StringD4 {
public static void main(String[] args){
    char c='n';
    String s=String.valueOf(c);
    System.out.println("print String:"+s);

    String s2=String.valueOf(new char[]{c});
    System.out.println("print :"+s2);
}
}
