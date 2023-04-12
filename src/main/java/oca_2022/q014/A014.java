package oca_2022.q014;

public class A014 {
	public static void main(String[] args) {
		String str = "Sweet Sweat";
		String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw", 1);
		System.out.println(str2);
	}
}
// no white space before and after "Sweat Sweat", so trim() is not effective
// 6th character in str is still S.        --     charAt(6) gives S  
// str.indexOf("Sw", 1); means return the index number of characters "Sw" but start to count from 1

//What is the result?
//A.	S 6
//B.	S 5
//C.	s-1
//D.	w 7
