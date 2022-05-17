
// without using scanner
package assignement;

public class CalSwitch {
    public static void main(String [] args){
        int no1=1, no2=2, rslt = 0;
        char o1= '+';
         /*   char o2='-';
             char o3='*';
             char o4='/';*/


        switch (o1){
            case '+': rslt=no1+no2;
             break;
            /* case '_': rslt = no1-no2;
             break;
             case '*': rslt = no1*no2;
             break;
             case '/': rslt = no1/no2;
             break; */
            default:
                System.out.println("error");

        }
        System.out.println("print result:"+no1+" "+o1+" "+no2+"="+rslt);
       // System.out.println("print result:"+no1+" "+o2+" "+no2+"="+rslt);
        // System.out.println("print result:"+no1+" "+o3+" "+no2+"="+rslt);
        //System.out.println("print result:"+no1+" "+o4+" "+no2+"="+rslt);

    }
}
