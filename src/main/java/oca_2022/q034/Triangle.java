package oca_2022.q034;

public class Triangle {
	static double area;
	int b= 2, h = 3;

	public static void main(String[] args) {
		double p, b, h;				// line n1 -->same variableName can be assigned to different data types √
		if (area == 0) {

			b = 3;
			h = 4;
			p = 0.5;
			area = p * b * h;		// line n2
		}
		System.out.println("Area is " + area);
	}
}
//
//What is the result?
//A.	Area is 6.0
//B.	Area is 3.0
//C.	Compilation fails at line n1
//D.	Compilation fails at line n2.

