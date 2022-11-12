package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("--- Welcome to Shawerma Restaurant ---\n");
        System.out.println("  - Shawerma Restaurant offers 2 types of Shawermas:");
        System.out.println("\tMeat - Chicken");
        System.out.println("  You can choose different type of toppings");
        System.out.println("\tCheese - Cocktail - Ketchup \n\tPickles - Tahini - Garlic\n");
        System.out.println("  - Please make sure you type the " +
                "order separated by a space, Shawerma type first then the addons");
        System.out.println("\ti.e.> Beef cheese Garlic Ketchup");

        while (true) {
            System.out.println("\n\t*Type 0 to exit*");
            System.out.print("\t\t> Type your order: ");
            String input = new Scanner(System.in).nextLine();
            if (input.equals("0")) {
                break;
            }
            Order.makeOrder(input);
        }
        System.out.println("Thanks for using the system!");
    }
}
