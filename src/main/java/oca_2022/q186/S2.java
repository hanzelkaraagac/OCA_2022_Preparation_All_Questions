package oca_2022.q186;

class S1{
    public void display(int x){
        System.out.println("Parent" +x);
    }
}
class S2 extends S1 {
    public void display(int x, int y){
        this.display(x);
        display(y);
        super.display(y);
    }
    public void display(int x){
        System.out.println("Child " +x);
    }
    public static void main(String[] args) {
        S2 sobj = new S2(); 
        sobj.display(10, 100);
    }
}



/*
What is the result?
A. Child 10hild 100
Parent 100
B. Parent 10
Child 10
Parent 1000
C. Child 10
Parent 100
Parent 100
D. A compile time error occurs.

Answer = A
Child 10
Child 100
Parent100
* */
