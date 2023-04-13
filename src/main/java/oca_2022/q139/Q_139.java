package oca_2022.q139;

public class Q_139 {
	static int count;

	public static void displayMsg() {

	System.out.println("Welcome visit count"+ count++); // line1
		// hata burda cunku count u static bir method icinde cagirmaya calismis
		// instance variable asagidaki static methodun icinde cagiramiyoruz
	}
	public static void main(String[] args) {
		displayMsg(); //class name ilede cagrilir
		displayMsg();   //line 2
	}

}
//answer line 1 compilation fail error


