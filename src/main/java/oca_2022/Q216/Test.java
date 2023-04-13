package oca_2022.Q216;
class Product{
    double price;
}
public class Test {
   public  void  updatePrice(Product product,double price){
        price=price*2;
        product.price=product.price+price;
   }

    public static void main(String[] args) {
        Product prt=new Product();
        prt.price=200;
        double newPrice=100;

        Test t=new Test();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price+":"+newPrice);
    }
}
/*
What is the result?
 A. 200.0 : 100.0
 B. 400.0 : 200.0
 C. 400.0 : 100.0
 D. Compilation fails.
  Answer: C

 */
