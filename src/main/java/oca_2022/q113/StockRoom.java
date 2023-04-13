package oca_2022.q113;

public class StockRoom {
    static   int stock=10;//statici ekledim
    static String qty; //ben ekledim
    public static void purchase(int qty){
    	stock +=qty;
    	}
    public  static void sell(int qty){
    	stock -=qty;
    	}
    public void printStock(String action){

		System.out.println(action+":"+ qty +
        		" items. Stock in Hand: " +stock);
    }

    public static void main(String[] args) {
        qty="5";
        StockRoom k1=new StockRoom();
        k1.sell(5);
        k1.printStock("Sold");
            StockRoom k2=new StockRoom();
        k2.purchase(5);
        k2.printStock("Purchased");
    }
}
/*You want the code to print:
Sold: 5 items. Stock in Hand: 5 Purchased: 5 items.
 Stock in Hand: 10? Which action enables the code to print this?
  A. Declare the stock variable and the purchase(), sell(), and printStock() methods static.
  B. Declare the stock variable and the printStock() method static.
  C. Declare the stock and qty variables and the printStock() method static.
  D. Declare the stock variable static.
Answer: C

 */
