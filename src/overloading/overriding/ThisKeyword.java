package overloading.overriding;

public class ThisKeyword {
    int a;
    int b;
    ThisKeyword(int a, int b){
        this.a = a;
        this.b = b;

    }
    int demo(){
        a = 20;
        b = 15;
        System.out.println(+a+" "+b);
        return a*b;
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(6,8);
//        tk.demo();
        System.out.println(tk.demo());

    }
}
