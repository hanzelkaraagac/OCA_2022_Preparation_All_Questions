package oca_2022.Q219;

public class SumTest {
    public static void doSum(byte x,byte y){
        System.out.println("byte sum is "+(x+y));
    }
    public static void doSum(long x,long y){System.out.println("long sum is "+(x+y));}
    public static void doSum(short x,short y){
        System.out.println("short sum is "+(x+y));
    }
    public static void doSum(int x,int y){System.out.println("integer sum is "+(x+y));}
    public static void doSum(Integer x,Integer y){
        System.out.println("Integer sum is "+(x+y));
    }
    public static void doSum(double x,double y){System.out.println("double sum is "+(x+y));}
    public static void doSum(float x,float y){System.out.println("float sum is "+(x+y));}

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
    }
}
// When we use an overloaded method, we can use the same name for the method but different parameters.
// When we do method call in the main method of the class, if we use an integer number
// the method call will go to the method which is having the float parameter.
// then integer, then long, then short, then byte.
/*
What is the result?
A  float sum is 30.0
   double sum is 30.0
B  double sum is 30.0
   float sum is 30.0
C  Integer sum is 30
   double sum is 30.0
D  Integer sum is 30
   float sum is 30.0

A Option A
B Option B
C Option C
D Option D
answer A
 */
