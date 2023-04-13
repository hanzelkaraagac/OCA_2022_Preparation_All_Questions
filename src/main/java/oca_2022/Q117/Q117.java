package oca_2022.Q117;

public class Q117 {
    public static void main(String[] args) {
        String ta="A ";
        ta=ta.concat("B ");//A B
        String tb="C ";
        ta=ta.concat(tb);//A B C
        ta.replace('C','D');// A B C
        ta=ta.concat(tb); //A B C C
        System.out.println(ta);
    }
}
/*What is the result?
 A. A B C D
 B. A C D
 C. A C D D
 D. A B D
 E. A B D C
 Answer: ABCC

 */