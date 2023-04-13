package oca_2022.q044;

import java.util.Scanner;

// Given the code fragment:

public class Game {
    public static void menu() {
        System.out.println("1. Left 2. Right 0. Stop");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            menu();
            System.out.println("What is your choice?");
            option = input.nextInt();
            if (option == 1) {
                System.out.println("You chose Left");
            } else if (option == 2) {
                System.out.println("You chose Right");
            }
        } while (option != 0);
        System.out.println("Bye!");
    }
}
//and the requirements of the application:
// 	It must display the menu.
// 	It must print the option selected.
// 	It must continue its execution till it reads ‘0’.
//Which code fragment can be used to meet the requirements?

/*
A. for (option = 0; option !0; option = // code that reads the option goes here){
	//code that print the option goes here 
	}
	
B. while (option !=o){
	menu();
	option = //  code that reads the option goes here
	//code that print the option goes here 
	 }

C. do {
	menu();
	option = //  code that reads the option goes here
	//code that print the option goes here 
	 }while (option != 0);
	
D. while (option != 0);{
	menu();
	option = //  code that reads the option goes here
	//code that print the option goes here 
	 }

*/