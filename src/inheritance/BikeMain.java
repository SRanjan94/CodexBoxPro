package inheritance;

public class BikeMain {
    public static void main(String[] args) {
        Busa sb = new Busa();
        sb.setEng("1200cc");
        sb.setInt0(299);
        sb.setAg(true);
        System.out.println(sb.getEng());
        System.out.println(sb.getInt0());

        SuperBike sb2 = new Ninja10R();
        //sb2.int


    }
}
