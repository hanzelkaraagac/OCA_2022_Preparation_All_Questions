package oca_2022.q180;

public class CCMask {
	public static String maskCC(String creditCard) {
String x = "XXXX-XXXX-XXXX-";
//line n1
//return x + creditCard.substring(15, 19); // -->Answer B
		
StringBuilder sb = new StringBuilder(x); //--> Answer C
sb.append(creditCard, 15, 19);
return sb.toString();
}
public static void main(String[] args) {
System.out.println(maskCC("1234-5678-9101-1121"));
		

	}
}