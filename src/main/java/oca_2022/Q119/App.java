package oca_2022.Q119;

public class App {
  String greet="Welcome!";
    public App(){

        String greet="Hello!";
//       System.out.println("ben constructorum once beni yazdir");
        System.out.println(greet);
    }
    public void setGreet(){
        String greet="Good Day!";
        this.greet=greet;
    }

    public static void main(String[] args) {
        App t=new App();
        String greet="Good Luck!";
      System.out.println(t.greet);
    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer C
 */
