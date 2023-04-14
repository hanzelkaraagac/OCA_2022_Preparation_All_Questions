package oca_2022.q207;

public class Q207 {
    public static void main(String[] args) {
//        int[][] arr=new int[2][4];
//
//        arr[0]=new int[]{1,3,5,7};
//        arr[1]=new int[]{1,3};
//
//        for (int[] a:arr){//length 2 oldugu icin 2 ye kadar olan degerleri veriyor
//            for (int i = 0; i < arr[i].length; i++) {
//                System.out.println(a[i]+" ");
//            }
//            System.out.println();
           //207 answer 1 3 1 3 
//            
               
    	
    	//soru 132  answer1 3 5 7
    	//		           1 3
    	int [] [] arr = new int [2][4];
	        arr[0] = new int [] {1, 3, 5, 7,};
	        arr [1] = new int [] {1, 3};
            // {{1,3,5,7},{1,3}}
	        for (int[] a : arr) {
	            for (int i : a){
	                System.out.print(i + " ");

	            }
	            System.out.println();
	        }
       }}
    /*
    what is the result?
    A. 1 3 5 71 3
    B.  1 31 3
    C. 1 31 3 0 0
    D. 1 3followed by an ArrayIndexOutOfBoundsException
    E. Compilation
    */
    //Answer B  aciklamsi var v18

