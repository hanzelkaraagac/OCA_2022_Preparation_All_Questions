package oca_2022.q212;
interface I1 { }
class P1 { }
class P2 extends P1 implements I1{}
//and the given code

public class Q212{
    public static void main(String[] args) {
        P1 obj=new P1();
        P2 obj2=new P2();
        I1 obj3=new P2();
        boolean r1=obj instanceof P2;
        boolean r2=obj2 instanceof P1;
        boolean r3=obj3 instanceof I1;
        System.out.println(r1+":"+r2+":"+r3);
    //}
    /*
    What is the result?
    A. true:false:true
    B. false:true:true
    C. false:true:false
    D. true:true:false
     Answer: B
    */
   // public static void main(String [] args) {
    
//        Object t = new Q212();
//        // compiles fine since Object is a parent class to String
//        System.out.println(t instanceof String);
//
//        String s = new String("Hello");
//        if (s instanceof String) System.out.println("s is instance of String"); // True
//        if (s instanceof Object) System.out.println("s is instance of Object"); // True
//        //if (s instanceof StringBuffer) System.out.println("s is instance of StringBuffer"); // Compile error
    }
}