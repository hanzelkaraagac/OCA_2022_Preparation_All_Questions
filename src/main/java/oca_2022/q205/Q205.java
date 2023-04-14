package oca_2022.q205;

import java.time.LocalDate;

public class Q205 {
    //given the code fragment
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
    }
    /*whats the result?
    A.2012-02-10
    B.2012-01-30
    C.2012-02-10 00:00
    D. A DateTimeExceptions is thrown at runtime

cevap c diyor ama consolda b cikti
     */
}
