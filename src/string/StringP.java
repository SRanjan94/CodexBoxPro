package string;

public class StringP {
    public static void main(String [] args){
        String[] a = new String[3];
        a[0]="ram";
        a[1]="raju";
        a[2]="rakhi";
        for(int i=0; i<a.length; i++){
          if(a[i].equals("ram") || a[i] =="raju")
            {
                System.out.println("print Array:"+a[i].toUpperCase());
            }else {
              System.out.println("print Array error:"+a[i].length());
          }


        }
    }
}
