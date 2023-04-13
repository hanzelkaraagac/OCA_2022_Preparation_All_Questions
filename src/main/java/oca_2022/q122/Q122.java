package oca_2022.q122;

public class Q122 {
	public static void main(String[] args) {

		Short s1 = 200; 
		Integer s2 = 400;
		String s3 = (String.valueOf (s1+s2));//line n1 (Cannot cast from int to String)
//			Long s4 = (long)s1+s2; //line n2
			System.out.println("Sum is " + s3);
		     //Answer B  Compilation fails at line n1 
		}

	}
