package oca_2022.q223;

public class C1 {
	
}


	class C2 extends C1 {
		
	}

	class C3 extends C2 {
		public static void main(String[] args) {
			//int array[] = new int[3]; array = {1, 2, 3};
			
//			int array2[] = new int[] {1,2,3};
//			
//			int array1[] = new int[] {1,2,3};
//			
//			int array3[] = new int[3] {1, 2, 3};
//			
//			int array5[] = new int[]; array5 = {1, 2, 3};
//			
//			
//			int array[] = new int[3]; //dogru
//			array[0] = 1; array[1] = 2;
//			array[2] = 3;
			
	

	//and the code fragment:

	C1 obj1 = (C1) new C2();

	C2 obj2 = (C2) new C3();

	C2 obj3 = (C2) new C1(); //cant cast

	C3 obj4 = (C3) obj2;



}}
