package oca_2022.q077;

public class Q_77 {
    //59. Given this array:
    //Which two code fragments, independently, print each element in this array? (Choose two.)
    public static void main(String[] args) {
        int[] intArr = {8, 16, 64, 128};
        for (int i : intArr) {
            System.out.println(intArr[i] +" ");// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

            // A
//        for (int i : intArr){
//            System.out.println(intArr[i]-1 +" ");  we can not use intArr[i] //--> gives ArrayIndexOutOfBoundsException
//        }

            // B
//        for (int i : intArr){
//            System.out.println(i +" ");
//        }

            // C
//        for (int i = 0 : intArr){
//            System.out.println(intArr[i] +" ");//--> gives error
//            i++;
//        }

            // D
//       for(int i = 0; i < intArr.length; i++) {
//           System.out.println(i + " ");//--> gives 0 1 2 3
//       }

            //E
//        for(int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i] + " ");//--> gives 8 16 64 128
//        }

            // F
//        for(int i ; i < intArr.length; i++) {//--> gives error at this line
//            System.out.println(intArr[i] + " ");
//        }
    /*
    A. Option A
    B. Option B
    C. Option C
    D. Option D
    E. Option E
    F. Option F
    Answer: BE
     */

        }

    }
}
