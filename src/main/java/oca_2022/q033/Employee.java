package oca_2022.q033;

public class Employee {
	String name;
	boolean contract;
	double salary;
	Employee() {
		//line1
		name="Joe";
//		this.name = new String("Joe");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;	
	}	
	public static void main(String[] args) {
		Employee e = new Employee();
		// line2
		e.name="elif";
		System.out.println(e);		
	}
}
/* 
  Which two modifications, when made independently, enable the code to print joe:true:100.0 ? ( Choose Two)
 * Output w/o any change ==> null:false:0.0 

  		A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;
			
		B: Replace line2 with:
		 	this.name = "Joe";  		// this. cannot be  used in static content / main method
		 	this.contract = true;
			this.salary = 100;
		 
		 C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);
			
		D: Replace line n1 with: (was n2 in earlier versions, non-static fields can not be called under static methods)
		 	name = "Joe";
		 	contract = TRUE;  		// --> TRUE gives complitaion error
			salary = 100.0f;
			
		E: Replace line n1 with:
			this("Joe", true, 100);  	// could be used to call a constructor w/ 3 parameters
		
* 'toString()' method : Object class'inda zaten oldugu icin bu methodu yazdigimizda override goruruz ve
  her object olusturdugumuzda bu method calisir. Aslinda override etmeyince zaten memory'deki yerini gosterir.  	
		
		
		
		
		
		
*/

