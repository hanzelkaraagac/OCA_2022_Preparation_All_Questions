package oca_2022.q151;

public class Question151 {
}
//42.soru
		class Alpha{

		    int ns;
		    static int s; //100  100   125  static oldugu icin enson aldigi deger yazilacak   
		    //global deger int 0 ilk basta

		    Alpha(int ns){//100  0 125 if condition saglanmassa ns 0 oluyor
		        if(s<ns){
		            s = ns;
		            this.ns = ns;
		        }
		    }
		    void doPrint(){
		        System.out.println("ns = "+ns+" s = "+s);
		    }
		}
		class TestA{
		    public static void main(String[] args) {
		        Alpha ref1 = new Alpha(100);

		        Alpha ref2 = new Alpha(50);

		        Alpha ref3 = new Alpha(125);

		        ref1.doPrint();
		        ref2.doPrint();
		        ref3.doPrint();
		    }

		}
		/**
		 * A. ns = 100 s =125
		ns = 0 s = 125
		ns = 125 s = 125
		
		B. ns = 50 s = 50
		ns = 125 s = 125
		ns = 0 s = 125
		
		C. ns = 50 s = 125 ns = 125 s = 125
		ns = 0 s = 125
		
		D. ns = 50 s = 50 ns = 125 s =125
		ns = 100 s =100
		
		Answer:
		 */
		
		
		
		//What is the result?
		//A
//		            ns = 50   s = 125
//		            ns = 125  s = 125
//		            ns = 100  s = 125

		//B
//		            ns = 50  s = 125
//		            ns = 125  s = 125
//		            ns = 0  s = 125

		//C
//		            ns = 50  s = 50
//		            ns = 125  s = 125
//		            ns = 100  s = 100

		//D
//		            ns = 50  s = 50
//		            ns = 125  s = 125
//		            ns = 100  s = 125

		//A.	Option A
		//B.	Option B
		//C.	Option C
		//D.	Option D
		//Answer: B

		//second version

		//class Alpha{
		//
		//   static int ns;
//		    int s;
		//
//		    Alpha(int ns){
//		        if(s<ns){
//		            s = ns;
//		            this.ns = ns;
//		        }
//		    }
//		    void doPrint(){
//		        System.out.println("ns = "+ns+" s = "+s);
//		    }
		//}
		//class TestA{
//		    public static void main(String[] args) {
//		        Alpha ref1 = new Alpha(50);
//		        Alpha ref2 = new Alpha(100);
//		        Alpha ref3 = new Alpha(125);
//		
//		        ref1.doPrint();
//		        ref2.doPrint();
//		        ref3.doPrint();
//		    }
//		//
//		}

	