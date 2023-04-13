package oca_2022.q072;

public class Q_72 {
}
class Test2 {
	 public static void main(String[] args) {
	        Test2 ts = new Test2();
	        System.out.print(isAvailable+"");
	        isAvailable = ts.doStuff();
	        System.out.println(isAvailable);

	    }
	    public static boolean doStuff(){
	        return !isAvailable;
	    }
	    static boolean isAvailable = false; //once isavailble yazdiriyor sonra dostaff
	}
	/*
	What is the result?
	A.	Compilation fails.
	B.	false true
	C.	true false
	D.	true true
	E.	false false
	Answer: B

	 */

