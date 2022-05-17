package oppsconcept;

 class Rectangle extends Shape {
    private int l;
    private int b;

    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    @Override
    void m1() {
        System.out.println("print rectangle:" +l*b);

    }
}
