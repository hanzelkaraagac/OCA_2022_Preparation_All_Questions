package oca_2022.q208;

class Caller {
   private void init(){

        System.out.println("Initialized");
    }
    private void  start(){
        init();
        System.out.println("Started");
    }
}
public  class TestCall{
    public static void main(String[] args) {
        Caller c=new Caller();
//        c.start(); //line 1
//        c.init(); //line 2
    }
}
/*
Whats the result?
A. Compilation fails at line n1.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails at line n2.
Answer: D   ama ikiside fail hata veriyo
 */
