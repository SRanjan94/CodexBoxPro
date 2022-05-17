package wrapperclass;
//autoboxing

public class WrapperEx2 {
  private int i;
  private float f;

    Integer r = Integer.valueOf(i);                             //value will be taken in main method
    Float s = f;

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public Float getS() {
        return s;
    }

    public void setS(Float s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

   /* void displayWrapper(){

    }*/


}
