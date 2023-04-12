package oca_2022.q016;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q016 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);  // not assigned to dt, no effects on dt
		dt.plusMonths(1);// not assigned to dt, no effects on dt
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	}
}
//What is the result?
//A.	An exception is thrown at runtime.  // if it was written with .parse()...
//B.	07-31-2014 										// LocalDateTime.of(2014, 7, 31, 1, 1); -- gives the format
//C.	2014-07-31  	
//D.	2014-09-30		 								// dt was not assigned as dt = dt.plus... --> false

