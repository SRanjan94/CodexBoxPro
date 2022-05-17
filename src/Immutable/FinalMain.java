package Immutable;

public class FinalMain {
    public static void main(String[] args) {
        FinalEx fe = new FinalEx(1,"SRanjan",36.99);
        fe.getD();
        fe.getN();
        fe.getS();
        System.out.println("print msg:"+fe.getN()+","+ fe.getD()+","+fe.getS());
    }
}
