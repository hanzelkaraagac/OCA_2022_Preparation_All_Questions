package oca_2022.q056;

public class Q056 {

	public static void main(String[] args) {
		String string = " "; // there is white space , not empty
		string=string.trim(); //// it is not assigned to string, no affect
		System.out.println(string.contentEquals("") + " " + string.isEmpty());
	}
}
//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true

