package Q214;

public class Test {
    public static final int MIN=1;

    public static void main(String[] args) {
        int x=args.length;
        if(checkLimit(x)){     //line 1
            System.out.println("Java SE");
        }else{
            System.out.println("Java EE");
        }
    }
    public  static boolean checkLimit(int x){
        return  (x>=MIN) ? true : false;
    }
}
// And given the commands:
//   javac Test.java
//   java Test 1
//  note cevap b ama mantik olarak bence a biri bana anlatsin
//What is the result?
//        A. Java SE
//        B. Java EE
//        C. Compilation fails at line n1.
//        D. A NullPointerException is thrown at runtime.
//        Answer: B

