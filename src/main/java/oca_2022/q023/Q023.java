package oca_2022.q023;

public class Q023 {

	public static void main(String[] args) {
		char colorCode = 'y';
		switch (colorCode) {
		case 'r':
			int color = 100;
			break;
		case 'b':
			color = 10; // doesn't result error because color is initialized in the switch block
			break;
		case 'y':
			color = 1;  // doesn't result error because color is initialized in the switch block

			System.out.println(color);
		}
	 // cannot read the variable, created in the switch block
	}
}
//What is the result?
//A.	It results in a compile time error at line 18.
//B.	It results in a compile time error at line 9.
//C.	It prints : 1
//D.	It results in a compile time error at lines at lines 12 and 15.

