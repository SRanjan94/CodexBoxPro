package oppsconcept;

import java.awt.Shape;

public class MainShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,9);
        r.m1();

        Circle c = new Circle();
        c.setR(66);
        c.setH(55);

       Shape c2 = (Shape) new Circle();      //casting






        System.out.println("print the mu value :"+c.getR()*c.getH());
    }
}
