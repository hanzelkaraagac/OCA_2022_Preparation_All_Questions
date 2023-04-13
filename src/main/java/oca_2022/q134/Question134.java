package oca_2022.q134;

public class Question134 {

	}
		/*
		which two class definitions fail to compile?(choose two)
		dogru cevap:
		Option C --> private access modifier yazılmıs.
		Option E --> final abstract yazilmis. ikisi ayni anda olmaz, abstract class final olmaz.
	*/


	//
		//A 
		abstract class A3 {
			private static int i;
			public void doStuff() {}
			public A3() {}
	//
		}

		//B
		final class A1 {
			public A1() {
			}
		}

		// C --> We can not declare top level class as private. Java allows only public and
		//       default modifier for top level classes in java. Inner classes can be private.

//		private class A2 {
//			private static int i;
//			private A2() { }
//		}


		//D
		class A9 {
	    protected static final int i =10 ;
	    private A9() { }
	}

		//E -->  class can be final or abstract, not both of them
//		final abstract class A5 {
//	    protected static int i;
//	    void doStuff() { }
//	    abstract void doIt();
//	}



	/*
	aynı kitabın diğer basımında soru aşağıdaki gibi değiştirilmiş (C ve D şıkkı farklı yazılmış)
	bu yazıma göre doğru cevap: D E

	//A
		abstract class A3 {
			private static int i;
			public void doStuff() { }
			public A3(){ }
		}

		//B
		final class A1{
			public A1(){  	}
		}

		// C
			 public class A2 {
				 private static int i;
				 private A2() {}
			}


		//D
			class A4{
				protected static final int i; //i assign yapilmamis
				private A4() { 	}
			}

		//E

			final abstract class A5{
				protected static int i;
				void doStuff() {}
				abstract void doIt();
			}
	 */
