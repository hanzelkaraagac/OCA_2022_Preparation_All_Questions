package oca_2022.q194;

public class Q194 {
    public static void main(String[] args) {
        //insert code here    //line 3
//    	int [] array;
//    	array = new int [2];
        int [] array = new int[2];
        array [0]= 10;
        array [1]= 20;
        System.out.println(array[0] + " : " + array[1] );
    }
}

//Which code fragment, when inserted at line 3, enables the code to print 10:20?

// A.  int [] array = new int [1];

// B.  int [] array;
//      array = new int [2];

// C.   int array = new int [2];

// D.   int array [1];

//ans: B
//
//
///**
// * Explanation:
// * Your code:
// * 1. public class Test{
// * 2.   public static void main(String[] args) {
// * 3.      int [] array
// * 4.      array = new int[2]
// * 5.      array [0]= 10;
// * 6.      array [1]= 20;
// * 7.      System.out.println(array[0] + " : " + array[1] );
// *
// * output:   10 : 20
// *     }
// * }
// */