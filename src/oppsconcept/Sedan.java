package oppsconcept;

  class Sedan extends Abstraction{
      private int price;

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

    private int tax;

      public int getTax() {
          return tax;
      }

      void setTax(int tax) {
          this.tax = tax;
      }

    /*  Sedan(int price, int tax){
        this.price=price;
        this.tax=tax;

    }*/
    @Override
    public void m1() {
        //int sum=price+tax;
        //System.out.println("Total Price:"+sum);
    }

    @Override
    public void m2() {
        int sum2=price*tax;
        if( sum2 < 10000){
            System.out.println("on Road Price:"+sum2);
        }else
        System.out.println("wrong on Road Price:"+sum2);
    }
}
