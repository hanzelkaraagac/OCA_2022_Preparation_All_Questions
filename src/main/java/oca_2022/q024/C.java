package oca_2022.q024;

class A{
	public A() {

		System.out.print("A ");
	}
}
class B extends A{
	public B() {

		System.out.print("B ");
	}
}
class C extends B{
	public C() {

		System.out.print("C");
	}
	public static void main(String[] args) {

		C c = new C();
		A a = new A();
	}
}

//What is the result?
//A.	C B A
//B.	C
//C.	A B C
//D.	Compilation fails at line n1 and line n2


