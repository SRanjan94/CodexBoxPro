package wrapperclass;
//unboxing

public class WraperEx {
    private int i;
    private float f;
    Integer aint = new Integer(23);
    Float aFloat = new Float(5.5);

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public Integer getAint() {
        return aint;
    }

    public void setAint(Integer aint) {
        this.aint = aint;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = aFloat;
    }

    void displayWrapper() {
    }
}

