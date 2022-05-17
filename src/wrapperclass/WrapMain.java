package wrapperclass;

import scannerclass.WrapperUsingScan;

public class WrapMain {
    public static void main(String[] args) {
        WrapperEx2 we = new WrapperEx2();
        we.setI(32);                                        //autoboxing explicitly
        we.setF(2.9f);                                      //autoboxing implicitly

        System.out.println(we.getI());
        System.out.println(we.getF());

        WraperEx we2 = new WraperEx();
        int i = we2.aint;                                   //unboxing
        float v = we2.aFloat;

        System.out.println(i);
        System.out.println(v);

        WrapperClassConst we3 = new WrapperClassConst();           //string to integer
     //  we3.setS("1099");
        we3.setItr(1099+1);
        System.out.println(we3.getItr());


    }
}
