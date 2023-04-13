package oca_2022.q176;

abstract class Robot implements Speakable {
	public abstract void process();
	 //Bu method abstract olmali cunki abstract class must have abstract method
							//or non abstract ama body olmali
}                           //public abstract void process();--> Helping... Done print eder(answer

class Humanoid extends Robot {
	public void speak (String s) {
		System.out.println(s);
	}
	public void process () {
		System.out.println("Helping... ");
	}
}
interface Speakable {
	public void speak(String s);
}


public class RobotApp {

	public static void main(String[] args) {

		Robot r = new Humanoid();
		r.process();
		r.speak("Done");

	}

}
/*
 * Which action enables the code to print Helping� Done?
A. replace class Humanoid extends Robot {
with abstract class Humanoid extends Robot {
B. replace interface Speakable { with abstract class Speakable
C. replace public void process();
with public abstract void process();
D. replace abstract class Robot implements Speakable { with class Robot extends Speakable {
Answer: C
177.
*/
