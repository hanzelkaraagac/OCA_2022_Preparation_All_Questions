package oca_2022.q103;

public class Q103 {

    public static void main(String[] args) {

        int x;
//	x = 100;
//while (x <= 100) {
//	x++;
//	System.out.println( "Welcome "+x);
//
//}


//which code fragment at line 10 prints Welcome 100?

//A.
//	for(x = 100; x<=100; ++x) {
//	System.out.println( "Welcome "+x);
//}


//C.
        x = 100;
        while (x <= 100) {
            x++;
            System.out.println("Welcome " + x);
        }


//D.
        x = 100;
        do {

            System.out.println("Welcome " + x);
			++x;
        } while (x < 100);


//			A. Option A
//			B. Option B
//			C. Option C
//			D. Option D
//			Answer: B

    }
}