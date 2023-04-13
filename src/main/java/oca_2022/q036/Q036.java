package oca_2022.q036;

public class Q036 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " " ); // prints arr[0] which is A
			if (arr[i].equals("A")) {  // returns false for arr[0]
				continue; // if condition is false so does not continue in loop
			}				//true oldugu
			System.out.println("Work Done"); // printed out
		break;
		}
	}
}
//What is the result?
//A.	A B C Work done
//B.	A B C D Work done
//C.	A Work done
//D.	Compilation fails

