package oca_2022.q221;

import java.util.ArrayList;
import java.util.List;

public class Q221 {
    public static void main(String[] args) {
        List colors=new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(2,"cyan");
//        colors.set(2,"magenta");
        System.out.println(colors);
    }
}
//    What is the result?
//        A. [green, red, yellow, cyan]
//        B. [green, blue, yellow, cyan]
//        C. [green, red, cyan, yellow]
//        D. An IndexOutOfBoundsException is thrown at runtime.
//        Answer: D  ama cevap B cikti
