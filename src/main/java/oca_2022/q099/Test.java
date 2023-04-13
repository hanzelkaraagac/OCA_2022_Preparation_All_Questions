package oca_2022.q099;



public class Test {
	
	public static void main(String[] args) {
//		Employee e1 = new Employee(); // defoult contructor olmadigi icin
			                         //Employee classda hata veriyor.

		Employee e2 = new Employee("Jack",50);
		Employee e3 = new Employee("Chloe",40,5000);
//		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
		
		}
		}

		/*
		 
		 Which is the result?
		 A) Compilation fails in the Employee class
		 
		 B) null : 0 : 0
		  	Jack : 50 : 0
		 	Chole : 40 : 5000
		 
		 C) null : 0 : 0
		  	Jack : 50 : 2000
		 	Chole : 40 : 5000

		 D) Compilation fails in the Test class
		 
		 E) Both the Employee class and the Test class fail to compile
		 
		 cevap: E

		 Employee classda ;constructorda This() ilk satırda yer almalı.
		  ikinci satıra yazılmıs hata veriyor bu yüzden
		  
		 Test class da e1 object olusturulurken default constructor kullanilmis
		  ama employee classda default constructor yok	
		  
		   eger employee class da default constructor olusturup, 
		   this() i de ilk step de yazarsak kod compile olur.
		   
		   hem default constructor tanimlanip hem de this() ilk satırda yazılsaydı cevap:

						null : 0 : 0
						Jack : 50 : 2000
						Chloe : 40 : 5000


		ibrah note: this up
	                setSalary down

	              sonuc D oluyor only test class fails


		 */
		


