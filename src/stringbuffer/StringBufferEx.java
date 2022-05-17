package stringbuffer;

import java.security.spec.RSAOtherPrimeInfo;

public class StringBufferEx {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        sb.insert(4,"new");
        System.out.println("print stringBuffer:"+sb);
    }
}
