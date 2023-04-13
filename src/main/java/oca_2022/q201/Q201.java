package oca_2022.q201;

public class Q201 {
}
class Student {
    String name;
    public Student(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args){

        Student [] students= new Student[3];;
        students[0]=new Student("A");
        students[1]=new Student("Richard");
        students[2]=new Student("Donald");

        for( Student s:students){
            System.out.println(" "+s.name);
        }
     }

//second way
//
//        Student [] students= new Student[3];
//        students[1]=;hfder

















//        students[2]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/


