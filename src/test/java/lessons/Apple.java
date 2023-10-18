package lessons;

import java.util.Scanner;

public class Apple {

    public static void main(String[] args) {
        System.out.println("Welcome to the program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        System.out.println("Your name: " + name);

        name = name.toUpperCase();
        System.out.println("Final name: " + name);

        // Ask the user to enter their age and calculate their year of birth and print the result

        // Task 2: Temperature convertor.
        // User shouuld enter the celcius and it should convert to fahrenheit


    }
}
