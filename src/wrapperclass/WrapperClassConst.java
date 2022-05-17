package wrapperclass;

public class WrapperClassConst {
 /*  private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }*/

    private String str =new String("0000");
    Integer itr = Integer.valueOf(str);

    public Integer getItr() {
        return itr;
    }

    public void setItr(Integer itr) {
        this.itr = itr;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
