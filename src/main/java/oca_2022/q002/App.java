package oca_2022.q002;

public class App {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = (j +=i) / 5;		// k = 30/5 =6       
		// (j = j+i) = (j = 30)  in parentheses j is equalized to 30
		System.out.print(i + " : " + j + " : " + k);
	}
}
