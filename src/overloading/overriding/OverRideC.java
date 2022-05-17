package overloading.overriding;

class OverRideC extends OverRideP {
    float sum(float e) {
        return e;
    }

    int sum(int a, int b){
        return a+b+10;

    }


    public static void main(String[] args) {

        OverRideP or1 = new OverRideP();                     // crt obj in par ref par
        OverRideC or2 = new OverRideC();
        OverRideP or3 = new OverRideC();

        System.out.println("1st obj p to p:"+or1.sum(4,67));
        System.out.println("2nd obj c to c:"+or2.sum(3, 4));
        System.out.println("2nd p to c:"+or3.sum(9, 65));
    }
}

