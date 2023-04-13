package oca_2022.q069;

public class Q_69 {

}
class Test {
    public static void main(String[] args) {

    String[][] chs = new String[5][2];
    chs[0] = new String[5];
    chs[1] = new String[2];
    int i = 97;
       //System.out.println(chs[1].length);

    for (int a = 0; a < chs.length; a++) {
        for (int b = 0; b < chs.length; b++) {
            chs[a][b] = " " + i;
            i++;

        }
    }
    for (String[] ca : chs) {
        for (String c : ca) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
}
//answer =ArrayIndexOutOfBoundsException

//second version Q82
//public static void main(String[] args) {
//
//    String[][] chs = new String[2][];
//    chs[0] = new String[2];
//    chs[1] = new String[5];
//    int i = 97;
//     System.out.println(chs[1].length);
//
//
//    for (int a = 0; a < chs.length; a++) {
//        for (int b = 0; b < chs.length; b++) {
//            chs[a][b] = " " + i;
//            i++;
//
//        }
//    }
//    for (String[] ca : chs) {
//        for (String c : ca) {
//            System.out.print(c + " ");
//        }
//        System.out.println();
//    }
//}
//}
//97  98
//99  100 null null null


/**
* What is the result?
* A. 97 9899 100 null null null
* B. 97 9899 100 101 102 103
* C. Compilation fails.
* D. A NullPointerException is thrown at runtime.
* E. An ArrayIndexOutOfBoundsException is thrown at runtime.
*
* Answer: E
* 
*/
