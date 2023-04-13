package oca_2022.q041;

public class Q041 {

	public static void main(String[] args) {
		System.out.println("Result A " + 0 +1);        
		System.out.println("Result B " + (1) + (2));
//		System.out.println("Result C " + (1 + 2));
//		System.out.println(1 + 2 + " Result E " + (3) + (4));
	}
	// when the first statement is String, the following int values will be concatenated as String
	// when the first statement is String, the following equation in parentheses will be considered as int
	// when the first statement is int, they will be considered as int
}
/*
What is the result?
A. Result A 01
	Result B 3
	
B. Result A 1
	Result B 12
	
C. Result A 1
	Result B 3
	
D. Result A 01
	Result B 12
*/