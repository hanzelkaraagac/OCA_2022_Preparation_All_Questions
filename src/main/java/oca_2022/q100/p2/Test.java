package oca_2022.q100.p2;

import q100.p1.Acc;

public class Test extends Acc {
	    
		
		public static void main(String[] args) {
	        Acc obj = new Acc();
	        obj.s = 4;
//	        obj.r = 5;

	        Acc obj2 = new Test();
	        obj2.s = 4;
	        ((Test) obj2).r = 5;


	        Test obj1 = new Test();
	                obj1.s = 4;
	                obj1.r = 5;



	//Protected is inheritable to sub class (outside the package) so there for if
	// the sub class’ object was created then you could access to the protected variable.
	// But the object was created from super class
//	      Acc obj = new Test();
	                obj.s = 4;
//	                obj.r = 5;
	    }
	}
	/**
	 Which statement is true?
	  A. Both p and s are accessible via obj.
	  B. Only s is accessible via obj.
	  C. Both r and s are accessible via obj.
	  D. p, r, and s are accessible via obj.

	 Answer: B
	 
	 
	 So, public can be reached from anywhere....
	 protected can be reached from the same package,
	 and if we need to reach from another package,
	 it needs to be extend from parent AND needs to
	 create an object from the child class...
	 Default only can be reached from same package...
	 Private only from same class.


	 */

