package oca_2022.q179;

public class TTest {
	
	int count = 0; //static son degeri aldi
	int i= 0;   //static int i --> olursa 5 : 5 print eder 
	
public void changeCount () {
while (i<5) {
i++;  //i++ ile count++ yerleri degissede ayni sonuc 10:10 verir
count++;
		}
}
public static void main(String[] args) {
		TTest check1 = new TTest ();
		TTest check2 = new TTest ();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : "+ check2.count);
	
		//Answer--> 10 : 10
	}
}
