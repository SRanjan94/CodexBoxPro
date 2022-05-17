package stringbuffer;

public class StrinBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("company hires freshers");

        sb.delete(6,7);
        System.out.println("delete:"+sb);

        sb.insert(6, "y");
        System.out.println("print new name:"+sb);

        sb.reverse();
        System.out.println("reverse:"+sb);
        sb.reverse();

        sb.replace(0,10,"smrutiranjan");
        System.out.println("replace:"+sb);


        System.out.println(sb.substring(1));
        System.out.println(sb.substring(1,5));

        sb.append(2);
        System.out.println(sb);
    }
}
