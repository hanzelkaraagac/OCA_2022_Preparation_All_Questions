package oca_2022.q223;

public class Q223 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=0;
        do {
            System.out.println(arr[i]+" ");
            i++;
        }while(i<arr.length+1);

    }
}
/*What is the result?
A. 1 2 3 4followed by an ArrayIndexOutOfBoundsException
B. 1 2 3
C. 1 2 3 4
D. Compilation fails.
 Answer: B  diyor ama cevap A  aciklamsinda Console 8 9 10 farkli demis

 */