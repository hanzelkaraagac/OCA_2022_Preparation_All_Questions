package oca_2022.q081;

public class Q_81 {
	//81. Which two code fragments cause a compilation error? (Choose two.)
			public static void main(String[] args) {
				 /*
		        Which two code fragments cause a compilation error?(Choose two.)
		        A.float flt=100.00F;
		        B.float flt=(float)1_11.00;
		        C.Float flt=100.00;
		        D.double y1=203.22; float flt=y1;
		        E.int y2=100;float flt=(float)y2;
		        Answer:AD
		        **********Seceneklerde variable flt ayniydi ama hata vermesin diye asagida numaralandirdim.
		         */
		//A.
		        float flt=100.00F;
		//B.
		        float flt2=(float)1_11.00;
		//C.
		       Float flt3= 100.00F;// (Wrapper class'ta da F i kullanmak gerekiyor.)
		//D.
		         double y1=203.22;
		        float flt4= (float) y1;
		//E.
		        int y2=100;
		        float flt5=(float)y2;
		}	
			
			

			}
