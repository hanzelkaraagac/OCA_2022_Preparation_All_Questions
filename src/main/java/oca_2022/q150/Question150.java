package oca_2022.q150;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question150 {

	

	
	public static void main(String[] args) {
		
		LocalDateTime dt =LocalDateTime.of(2014,7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));


		
		//Answer: C. 2014-07-31
		
		/* LocalDateTime mi LocalDate mi dikkat edelim
		LocalDate dt =LocalDate.of(2014,7,13);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

		 */
		/*
		 What is the result?  ( Answer C --> 2014-07-31 )
		 
			A. An exception is thrown at runtime.
			B. 07-31-2014
			C. 2014-07-31
			D. 2014-09-30


		dt= dt.plusDays(30); bu sekilde tekrar dt ye assign etmedigi icin tarih degismez
		dt= dt.plusMonths(1);
		 
		 */
		
	}
	}

