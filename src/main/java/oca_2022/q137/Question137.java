package oca_2022.q137;

public class Question137 {


    public static void main(String[] args) {

        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = n[i].length - 1; j >= 0; j--) {
                System.out.print(n[i][j]);
            }
        }
// Different version of the same code:
//        int n[][] = {{1, 3}, {2, 4}};
//        for (int i = 0; i <= n.length - 1; i++) {
//            for (int j =0; j <=  n[i].length - 1; j++) {
//                System.out.print(n[i][j]);
//            }
//        }
    }


}


//What is the result?
//		
//		Answer: 4231