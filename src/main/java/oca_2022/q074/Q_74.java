package oca_2022.q074;

public class Q_74 {
	public static void main(String[] args) {
		int ii=0;
		int jj=7;
		for(ii=0; ii<jj; ii+=2) { 
			System.out.print(ii+" ");
		}
		
		System.out.println();
		//answer 0 2 4 6
		//second version
		
		
			for(ii=0;ii<jj-1;ii+=2) { // 7-1 =jj=6 6 dan kucuk olmadigi icin 6 yi yazdirmaz
				System.out.print(ii+" ");
			}
		}
}



//answer 0 2 4


