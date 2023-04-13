package oca_2022.q060;

interface Readable {
	
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable {  		// line n1
	public void readBook() { }	
																		// line n2  // abstract class oldugu icin setBookMark();'i implement etmesine gerek yok.  
}
//class EBook extends Book { 								// line n3
//	public void readBook() { }
//																		// line n4
//
//}

/* 
 * Which option enables the code to compile? 
 * 
A. Replace the code fragment at line n1 with:
	class Book implements Readable{
	
B. At line ne insert:
	public abtract void setBookMark();
	
B. Replace the code fragment at line n3 with:
	abstract class EBook extensd Book{
	
D. At line n4 insert:
	public void setBookMark(){}

*/