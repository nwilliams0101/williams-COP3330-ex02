/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Williams
 */

package com.exercise2.numberofcharacters;
import java.util.Scanner;

public class NumberOfCharacters {
    public static void main(String[] args) {
        String string;
        int count = 0;

        System.out.println("What is the input string?");

        Scanner input = new Scanner(System.in);
        string = input.nextLine();

        count = string.length();

        System.out.println(string + " has " + count + " characters.");
    }
}
