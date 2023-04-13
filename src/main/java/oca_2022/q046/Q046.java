package oca_2022.q046;

public class Q046 {

	public static void main(String[] args) {
		int a= 3;
		int b = 2;
		int c = 1;
		int r1 = a *b /c + 1;  
		int r2 = a / b * c + 1;  
		int r3 = a * (b /(c + 1)); 
		System.out.println(r1 + " : " + r2 + " : " + r3 );
	}
}
//What is the result?
//A.	2 : 7 : 3
//B.	7 : 7 : 9
//C.	2 : 7 : 0
//D.	7 : 2 : 3
