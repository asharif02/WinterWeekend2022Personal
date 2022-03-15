package testPackage;

import java.util.Scanner; // imports the Scanner class from java utilities

public class BusinessPartners {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in); // creates a Scanner object
        System.out.println("Enter 3 names:");

        // takes user input - in this case it takes 3 names i feed it
        String name1 = stdin.nextLine(); // nextLine() expects a string value from the user
        String name2 = stdin.nextLine();
        String name3 = stdin.nextLine();

        // prints out each possible combination at least once
        System.out.print(name1 + ", " + name2 + ", and " + name3 + "\n"); // newline character added at the end
        System.out.print(name1 + ", " + name3 + ", and " + name2 + "\n");

        System.out.print(name2 + ", " + name1 + ", and " + name3 + "\n");
        System.out.print(name2 + ", " + name3 + ", and " + name1 + "\n");

        System.out.print(name3 + ", " + name1 + ", and " + name2 + "\n");
        System.out.print(name3 + ", " + name2 + ", and " + name1);
    }

}
