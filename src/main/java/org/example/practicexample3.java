/*
*   UCF COP3330 SUMMER 2021 ASSIGNMENT 3 SOLUTION
*   COPYRIGHT 2021 RAYME PERSAD
*/

/* EX3 Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output. */


package org.example;
import java.util.Scanner;

public class practicexample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Asking the user to enter quote
        System.out.print("What is the quote? ");

        String quote = sc.nextLine();   // Asking the user to enter author name
        System.out.print("Who said it? ");

        String author = sc.nextLine();  // Printing entered info
        System.out.println(author + " says, \""+quote+"\"");
    }  //end public
}   //end class
