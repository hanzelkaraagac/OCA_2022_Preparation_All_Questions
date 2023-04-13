package oca_2022.q025;

public class Q025 {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 3};
		int nums2[] = {1, 2, 3, 4, 5};
		nums2 = nums1;
		for (int x : nums2) {
			System.out.print(x + ": ");
		}
	}
}

//What is the result? 
//A. 1:2:3:4:5:
//B.	1:2:3:
//C.	Compilation fails.
//D.	An ArrayOutOfBoundsException is thrown at runtime.
//B answer