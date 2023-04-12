package oca_2022.q010;

public class TestScope {
	public static void main(String[] args) {
		int var1 = 200;
		System.out.print(doCalc(var1)); // prints the returned var fromdoCalc method
		System.out.print(" " + var1);  // prints the local var
	}
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}
}
//What is the result?
//A.	400 200
//B.	200 200 
//C.	400 400
//D. Compilation fails.
