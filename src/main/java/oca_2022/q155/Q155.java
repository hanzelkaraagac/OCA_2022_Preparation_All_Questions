package oca_2022.q155;

public class Q155 {
	
	

	public static void main(String[] args) {
		int wd=0;
		String days[] = {"sun","mon","wed","sat"};
		for (String s:days) {
			switch (s) {
			case"sat":
			case"sun":
				wd-=1;
					break;
			case "mon":
				wd++;
			case"wed":
				wd+=2;
			}
		}
		System.out.println(wd);
				
			
			
			}
		
		

	}
/*
 * What is the result?
A. 3
B. 4
C. -1
D. Compilation fails.
Answer: A
 */

