package oca_2022.q036;

public class Q36_4 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " " ); //1. arr[0] =String "A"
			if (arr[i].equals("A")) {  // 1. returns true  
				break; // 1. break to loop and goes out of it
			}
			System.out.println("Work Done");  // NOT printed out
			continue; 
		}
	}
}
