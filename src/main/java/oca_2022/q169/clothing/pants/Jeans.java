package oca_2022.q169.clothing.pants;
import static q169.clothing.Shirt.getColor;

public class Jeans {

        public void matchShirt() {
            //line n2
            String color= getColor();
            if(color.equals("Green")) {
                System.out.println("FIT");
            }
        }

        public static void main(String[] args) {
            Jeans trouser = new Jeans ();
            trouser.matchShirt();

        }
}
