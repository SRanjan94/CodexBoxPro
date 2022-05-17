package oops.concept;

public class BikeMain {
    public static void main(String[] args) {
        SuperBikesAbstraction superbike = new BmwS1000RR();
        System.out.println("bmw sylinder : "+superbike.sylinder());

        superbike = new Cbr650();
        System.out.println("cbr eng cap : "+superbike.engcap());

        BmwS1000RR bmw = new BmwS1000RR();
        bmw.setcNo(1925623790l);
        bmw.setpCapacity(2);
        System.out.println("bmw chassis no : "+bmw.getcNo());
        System.out.println("bmw pillion capacity : "+bmw.getpCapacity());

        Cbr650 cb650 = new Cbr650();
        cb650.setcNo(387482348273458l);
        cb650.setpCapacity(1);
        System.out.println("cb650 chassis no : "+cb650.getcNo());
        System.out.println("cb650 pillion capacity : "+cb650.getpCapacity());



    }
}
