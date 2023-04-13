package oca_2022.q053;

import java.util.Arrays;

public class Q053 {

	public static void main(String[] args) {
		int num [] [] = new int [1] [3];
		
		for (int i = 0; i < num.length; i++) {  // num.length = 1
			for (int j = 0; j < num.length; j++) {  // num[i].length =3
				num [i][j]= 10;  
			}
		}
		System.out.println(Arrays.deepToString(num));
	}}

/*
Which option represents the state of the num array after successful completion of the outer loop?

A. num [0] [0] = 10;
	num [0] [1] = 10;
	num [0] [2] = 10;
	
B. num [0] [0] = 10;
	num [1] [0] = 10;
	num [2] [0] = 10;
	
C. num [0] [0] = 10;
	num [0] [1] = 0;
	num [0] [2] = 0;
	
D. num [0] [0] = 10;
	num [0] [1] = 10;
	num [0] [2] = 10;
	num [0] [3] = 10;
	num [0] [0] = 0;
	num [1] [1] = 0;
	num [1] [2] = 0;
	num [1] [3] = 0;

*/