package oca_2022.q003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {
	public static void main(String[] args) {
		String date = LocalDate
							  .parse("2016-11-01") 											// time is not assigned here
							  .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
		System.out.println(date);
	}
}
/*
What is the result?
A. May 04, 2014T00:00:00.000
B. 2014-05-04T00:00: 00.000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime.
Answer: D
*/