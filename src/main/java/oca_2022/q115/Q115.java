package oca_2022.q115;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q115 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
//        LocalDate date2=LocalDate.of(6,20,2014);
        LocalDate date3=LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1= "+date1);
//        System.out.println("date2= "+date2);
        System.out.println("date3= "+date3);
    }
}
//
/*Assume that the system date is June 20, 2014. What is the result?
A  date1=2014-06-20
   date2=2014-06-20
   date3=2014-06-20

B  date1=06/20/2014
   date2=2014-06-20
   date3=June 20, 2014
C Compilation fails
D An exception is thrown at runtime

A. Option A
 B. Option B
 C. Option C
 D. Option D

 answer d
 */