package string;

public class StringD5 {
    public static void main(String [] args){
        char c='y';
        String s1="Rock";
        String s2=s1+c;     //insert char at the end
        System.out.println("print:"+s2);
        String s3=c+s1;   //insert char at the begin
        System.out.println("print:"+s3);
    }
}
