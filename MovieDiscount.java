/*
 * Programmer: Alex Chickowski
 * Date: September 25, 2020
 * Purpose: To calculate the price of a ticket at a movie theater after applying applicable coupons
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();

        // Print the cost of a movie ticket
        if (age < 13 || age > 64) {
        	if (coupon = true) {
        		System.out.println("Your ticket costs $9.5.");
        	}
        	else {
        		System.out.println("Your ticket costs $11.5.");
        	}
        }
        else {
        	if (coupon = false) {
        		System.out.println("Your ticket costs $14.5.");
        	}
        	else {
        		System.out.println("Your ticket costs $12.5");
        	}
        } 
    }
}
