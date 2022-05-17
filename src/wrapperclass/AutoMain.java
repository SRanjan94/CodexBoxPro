package wrapperclass;

public class AutoMain {
    public static void main(String[] args) {

        Autoandunboxing am = new Autoandunboxing(2,5.7f );
        //unboxing
        int i = am.integer;
        float f = am.bFloat;
        System.out.println("first no : "+am.i+" , "+am.f);

        Autoandunboxing am2 = new Autoandunboxing(8,2.3f );
        //autoboxing
        System.out.println("second no : "+am2.i+" , "+am2.f);



    }
}
