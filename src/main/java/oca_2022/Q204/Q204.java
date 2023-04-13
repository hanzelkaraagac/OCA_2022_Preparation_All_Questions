package oca_2022.Q204;

public class Q204 {
   /* 204. Which three statements describe the object-oriented features of the Java language?
        (Choose three.)
     A. Objects cannot be reused.
     B. A subclass must override the methods from a superclass.
     C. Objects can share behaviors with other objects.
     D.A package must contain a main class.
     E. Object is the root class of all other objects.
     F. A main method must be declared in every class.
     Answer: B C F  */
    int a=10;
    int b=20;
    public int sum(int a, int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
}

class Student extends Q204 {

    public int sum(int a,int b){
        super.a=a;
        super.b=b;
        return a+b;
    }

    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.a+s.b);
    }
}