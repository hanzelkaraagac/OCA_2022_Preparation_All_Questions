package oca_2022.q037;

public class Q037 {

	public static void main(String[] args) {
		int data [] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e !=key) {
				continue; // when matched goes back in to loop
//				count++; // cannot come after continue
			}
		}
		System.out.println(count + " Found");
	}

}
//What is the result?
//A.	Compilation fails.
//B.	0 Found
//C.	1 Found
//D.	3 Found
