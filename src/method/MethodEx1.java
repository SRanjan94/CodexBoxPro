package method;

public class MethodEx1 {
    public static int m1(int a, int b){
         a=23;
         b=45;
        int x=a;
        int y=b;

        int add=x+y;
        return add;
    }
        public static class B{
            public static void main(String[] args) {
                int addi = m1(5,8);

                System.out.println("print x and y:"+addi);

            }
        }
}

