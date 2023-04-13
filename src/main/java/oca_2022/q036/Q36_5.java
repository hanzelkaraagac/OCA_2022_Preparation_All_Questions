package oca_2022.q036;

public class Q36_5 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " " ); 
			if (arr[i].equals("D")) {  
				continue; 
			}
			System.out.println("Work Done");  
			continue; 
		}
	}
}
