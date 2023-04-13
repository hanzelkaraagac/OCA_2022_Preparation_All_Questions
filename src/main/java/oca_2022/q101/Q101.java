package oca_2022.q101;

public class Q101 {
	public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers [0]=10;
        numbers [1]=20;

        numbers=new int[4];//yeni array tanimlamis yukardaki gecersiz
        numbers [2]=30; //int oldugu icin null olmaz 00 olur
        numbers [3]=40;
        for (int x:numbers){
            System.out.print(" "+x);
        }

}
}
/*
* What is the result?
A. 10 20 30 40
B. 0 0 30 40
C. Compilation fails.
D. An exception is thrown at runtime.
Answer: B
* *Aynisi cikmis sinavda
* */