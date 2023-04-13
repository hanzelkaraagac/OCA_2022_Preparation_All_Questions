package oca_2022.q116;
class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
public class C extends A {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();

        b1=(A)b2;      //line1
        A b3= b2;   //line2 C cannot be cast to Q116.B
        b1.test();
        b3.test();
    }
}
/*What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.
Answer: e

 */