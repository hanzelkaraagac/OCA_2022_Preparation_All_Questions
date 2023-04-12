package oca_2022.q013;

class Vehicle{
	int x;
	Vehicle(){

		this(10);			// line n1
	}
	Vehicle(int x){

		this.x= x;
	}
}
 class Car extends Vehicle{
	int y;
	Car(){
		super(10);		// line n2
	}
	Car(int y){
		super(y); 
		this.y =y;

		System.out.println(x);
	}

	public String toString() {
		return super.x + " : " + this.y;
	}

	 public static void main(String[] args) {
		Vehicle y = new Car(20);  // in another version 20 is deleted ==> 10:0
		System.out.println(y);
	}}
 
// What is the result?
//		 A.	Compilation fails at line n2.
//		 B.	Compilation fails at line n1.
//		 C.	20:20
//		 D.	10:20

