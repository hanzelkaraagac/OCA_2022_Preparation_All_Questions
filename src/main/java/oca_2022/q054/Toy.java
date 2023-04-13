package oca_2022.q054;

public abstract class Toy {
    public abstract int calculatePrice(Toy t);
    public void printToy(Toy t) {
    }
}

// 54. You are asked to develop a program for a shopping application, and you are given this information:

//			The application must contain the classes Toy, EduToy, and ConsToy. The Toy class is the superclass of the other two classes.
//			The int calculatePrice (Toy t) method calculates the price of a toy.
//			The void printToy (Toy t) method prints the details of a toy.
// 		Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?

// A. 	
//		public abstract class Toy{															// In an abstract class: 
//		public abstract int calculatePrice(Toy t);									// The abstract methods have no body
//		public void printToy(Toy t) { /* code goes here*/}					// The concrete methods have body
//	}


// B.
//		public abstract class Toy{
//		public  int calculatePrice(Toy t);													// concrete with no body throws error
//		public void printToy(Toy t);															// concrete with no body throws error
//	}
	
// C. 
//		public abstract class Toy{
//		public  int calculatePrice(Toy t);													// concrete with no body throws error
//		public final void printToy(Toy t) { /* code goes here*/}
//	}
	

// D.
//		public abstract class Toy{
//		public abstract int calculatePrice(Toy t) { /* code goes here*/}		// abstract with body throws error
//		public abstarct void printToy(Toy t) { /* code goes here*/}				// abstract with body throws error
//	}

// 					Answer: A

