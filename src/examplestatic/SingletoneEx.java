package examplestatic;

public class SingletoneEx {
    private static SingletoneEx st;
    public String s;

    private SingletoneEx(){
        s = "hi";
    }
    public static SingletoneEx getI() {
        if (st == null)
            st = new SingletoneEx();
        return st;
    }
    }

