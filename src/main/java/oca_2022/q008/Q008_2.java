package oca_2022.q008;

public class Q008_2 {
	public static void main(String[] args) {	
		String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " " );
				if (arr[i][j].equals("B")) {
					continue;
				}			
			}
		break;
		}	
	}}
//What is the result? 
//A. A B C
//B.	A B C D E
//C.	A B D E
//D.	Compilation fails.


//continue; cannot be used outside of a loop
//break; cannot be used outside of a loop
