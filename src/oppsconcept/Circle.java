package oppsconcept;

 class Circle extends Shape{
    private int h;          //private
    private int r;

     public int getH() {
         return h;
     }

     public void setH(int h) {
         this.h = h;
     }

     public int getR() {
         return r;
     }

     public void setR(int r) {
         this.r = r;
     }

    /*Circle(int h,int r) {             //no need to put constructor after getter and setter
        this.h = h;
        this.r = r;
    }*/

    @Override
    void m1() {
      System.out.println("print the circle:"+h*r);
    }
}
