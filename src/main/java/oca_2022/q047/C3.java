package oca_2022.q047;


class C1{}

class C2 extends C1{}

public class C3 extends C2 {

	
	
	
	
	public static void main(String[] args) {
		C1 obj1 = (C1) new C2();		// line 16
		C2 obj2 = (C2)new C3();			// line 17
		C2 obj3 = (C2)new C1();			// Line 18 C1 cannot be cast to q047.C2
		C3 obj4 = (C3)obj2; 				// line 19
	}

}
//Which line throws ClassCastException?
//A.	line 18
//B.	line 17
//C.	line 19
//D.	line 16
