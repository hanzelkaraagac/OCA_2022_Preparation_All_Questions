package oca_2022.q189;

public class Test2 {
    public static int stVar = 100;
    public int var =200;

    public String toString () {
        return stVar + ":" + var;
    }
    public static void main(String[] args) {
        Test2 t1 = new Test2();
         t1.var =300;
        Test2 t2 = new Test2();
        t2.stVar =300;
        System.out.println(t1);  
        System.out.println(t2);
    }
}
/*
What is the result?
A. 300:300200:300
B. 300:100200:300
C. 300:00:300
D. 100:300300:200
Answer: D
 */