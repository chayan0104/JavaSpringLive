package test.chayan.prac;

import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {

    public static void main(String[] args) {
    	OptionalDemo od = new OptionalDemo();
    	od.check();
    }
    
    public void check() {

        // Prompt user to enter their name
        System.out.println("Hello, type your name!");
        Scanner sc = new Scanner(System.in);
        String inputname = sc.nextLine();

        // If input is not empty, update the Optional with the user's name
        Optional<String> name = Optional.of(inputname).filter(n-> !n.isEmpty());

        // Print the name, using the value inside the Optional (or default if empty)
        System.out.println("Your name is " + name.orElse("Not valid"));

        sc.close();
    	
    }
}
