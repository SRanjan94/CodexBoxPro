package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringD8 {
    public static void main(String[] args){


        String name1="Smruti";
        String name2="ranjan";

        if(name1.toUpperCase()=="smruti" || name2.toLowerCase()=="ranjan"){
            System.out.println("print name1:"+name1);
        }else{
            System.out.println("error");
        }
    }
}
