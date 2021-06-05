
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        String adj = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun +" "+ adverb +"? That's hilarious!");
    }
}