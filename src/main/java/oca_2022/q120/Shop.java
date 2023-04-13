package oca_2022.q120;

class Cart {

	Product p;
	double totalAmount;	
	}
	
class Product {
	String name;
	Double price;
}

 public class Shop {
	public static void main(String[] args) {
	
		Cart c = new Cart();
		System.out.println(c.p + ":" + c.totalAmount );
	
	}

}
/*What is the result?
A. null:null:0.0
B. null:null
C. <<HashCode>>:0.0
D. null:0.0
Answer: D
*/