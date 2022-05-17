package examplestatic;

public class Main {
    public static void main(String[] args) {
        SingletoneEx x = SingletoneEx.getI();
        SingletoneEx y = SingletoneEx.getI();

        System.out.println("hash code of x:"+x.hashCode());
        System.out.println("hash code of y:"+y.hashCode());

        if( x == y){
            System.out.println("print two obj");
        }
        else {
            System.out.println("error");
        }
    }
}
