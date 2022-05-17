package oppsconcept;

public class Xuv extends Abstraction {
    private String colour;

    Xuv(String colour) {
        this.colour = colour;

    }

    @Override
    void m1() {
//        String c1=colour;
        if(colour.equals("red")){
            System.out.println("print colour:"+colour);
        }else
        System.out.println("wrong colour:"+colour);
    }

    @Override
    void m2() {
//        String c2=colour;
        System.out.println("print 2nd colour:"+colour);
    }
}

