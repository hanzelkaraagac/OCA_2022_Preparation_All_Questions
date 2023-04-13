package oca_2022.q110;
//bunu kontrol edelim package leri mi ayri anlamadim
public class Base {
    public void test(){
        System.out.println("Base ");
    }
}
class DerivedA extends Base{
    public void test(){
        System.out.println("DerivedA ");
    }
}
class DerivedB extends  DerivedA{
    public void test(){
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1=new DerivedB();
        Base b2=new DerivedA();
        Base b3=new DerivedB();
        b1=b3;
        Base b4= b3;
        b1.test();
        b4.test();

    }
}
/*What is the result?

A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime.

Answer: C

 */
