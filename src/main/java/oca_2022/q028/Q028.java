package oca_2022.q028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028 {

	public static void main(String[] args) {
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf(s -> {System.out.print(s); return s.length() <= 2;} )){ // < 2
			System.out.println(" removed");
		}
	}
}
//What is the result?
//A.	Compilation fails.
//B.	The program compiles, but it prints nothing.
//C.	HiHowAreYou removed
//D.	An UnsupportedOperationException is thrown at runtime.
