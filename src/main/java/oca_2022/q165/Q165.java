package oca_2022.q165;

 public class Q165 {
//}

//public class OraString{
	String s;
	public boolean equals (Q165 str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	Q165(String s){
		this.s=s;
	}
public static void main(String[] args) {
	

String s1="Moon";

Q165 s2=new Q165("Moon");

if ((s1=="Moon")&&(s2.equals("Moon"))) {
	System.out.println("A");
}else {
	System.out.println("B");
}
if (s1.equals(s2.s)) {
	System.out.println("C");
}else {
	System.out.println("D");
}

}}


