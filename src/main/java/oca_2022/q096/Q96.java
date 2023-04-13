package oca_2022.q096;

public class Q96 {

	public static void main(String[] args) {
		
		int price = 1000;
		int qty = 2;
		String grade = "2";
		double discount = 0.0;
		switch (grade) {
		case "1" :
			discount = price * 0.1;
			break;
		case "2" :
			discount = price * 0.5;
//			continue;
		default:
			System.out.println("Thank you!");

	 }
		System.out.println(discount);

	}

}
/*
*Which statement is true?
		A. The program executes and prints: 500.0
		B. Commenting line 16 enables the program to print: Thank You! 500.0
		C. Commenting line 13 enables the program to print: Thank You! 500.0
		D. The program executes and prints: Thank You! 500.0
		Answer: B
Explanation:
*/