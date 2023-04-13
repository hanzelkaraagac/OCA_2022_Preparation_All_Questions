package oca_2022.q071;

public class Q_71 {

}


class C1 extends C2 implements I {
    public void displayI() {
        System.out.println("C1");

    }

      public static void main (String[]args){
        	C2 obj1 = new C1();
            I obj2 = new C1();

            C2 s =  (C2)obj2;  //class'a interface in objectini assign etmis o yuzden hata verir.// we cannot assign an interface to a class.
            I t = obj1;   //class'a class i,  interface e interface i assign yapabiliriz

            t.displayI();
         s.displayC2();

     }
 }
// dogru cevap Compilation fails (bir yerde de cevabi A olarak gostermis lakin asil cevap compilation fails olmali

