package com.techelevator;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Should be 6.99
        Pizza p1 = new Pizza("Plain", "Small", new String[]{"Chicken"});

        // Should be 0.5 + 13.99 + 5.00; The oracle. Since it's a specialty, toppings arnt included in price.
        Pizza p2 = new Pizza("Parmesan", "Jumbo", new String[]{"Pepperoni", "Sausage", "Chicken", "Ham", "Anchovies", "RoastedPeppers", "Mushrooms", "Tomatoes"});

        // Should be 1 + 10.99 + 5. This should be the Nerd. Since it's a specialty, toppings arnt included in price.
        Pizza p3 = new Pizza("Something", "Large", new String[]{"RoastedPeppers", "Chicken", "Basil", "Feta"});

        // Should be 0 + 8.99 + 2.25 (0.75 * 3 Toppings).
        Pizza p4 = new Pizza("Whole Wheat", "Medium", new String[]{"RoastedPeppers", "Chicken", "Sausage"});

        // Should be 0 + 8.99 + 3 (0.75 * 4 Toppings).
        Pizza p5 = new Pizza("Whole Wheat", "Medium", new String[]{"RoastedPeppers", "Chicken", "Sausage", "Mushrooms"});

        // Should be 0 + 11.99.
        Pizza p6 = new Pizza();
        p6.setCrustType("Plain");
        p6.setSize("X-Large");
        p6.setToppings(new String[]{"Chicken"});

        System.out.format("Pizza number 1 should cost 6.99: %.2f\n", p1.calculatePrice());
        System.out.format("Pizza number 2 for the Oracle should cost 19.49: %.2f\n", p2.calculatePrice());
        System.out.format("Pizza number 3 for the Nerd should cost 16.99: %.2f\n", p3.calculatePrice());
        System.out.format("Pizza number 4 should cost 9.74: %.2f\n", p4.calculatePrice());
        System.out.format("Pizza number 5 should cost 10.49: %.2f\n", p5.calculatePrice());
        System.out.format("Pizza number 6 should cost 11.99: %.2f\n\n", p6.calculatePrice());

        // Should automate zipcode to default which is 48120. The price would be 2.00;
        PizzaDelivery pd1 = new PizzaDelivery("Larry", "Johnson", 11111);

        // The price would be 5.00;
        PizzaDelivery pd2 = new PizzaDelivery("Billy", "Jean", 48128);

        // Should automate zipcode to default which is 48120. The price would be 2.00;
        PizzaDelivery pd3 = new PizzaDelivery();
        pd3.setZipCode(48124);
        pd3.setFirstName("Eric");
        pd3.setLastName("Cameron");

        System.out.format("Delivery 1 should cost 2.00: %.2f\n", pd1.calculateDeliveryPrice());
        System.out.format("Delivery 2 should cost 5.00: %.2f\n", pd2.calculateDeliveryPrice());
        System.out.format("Delivery 3 should cost 3.00: %.2f\n\n", pd3.calculateDeliveryPrice());

        PizzaOrder order1 = new PizzaOrder("Plain", "Jumbo", new String[]{"RoastedPeppers", "Tomatoes", "Mushrooms"}, "Jerry", "Springer", 873485);
        System.out.println(order1);

        PizzaOrder order2 = new PizzaOrder("Parmesan", "X-Large", new String[]{"Tomatoes", "Mushrooms"}, "Berry", "Springer", 48124);
        System.out.println(order2.toString() + "\n");

        PizzaOrder order3 = new PizzaOrder("Whole Wheat", "Small", new String[]{"RoastedPeppers", "Tomatoes", "Mushrooms", "Ham", "Pepperoni"}, "Harry", "Springer", 48128);
        System.out.println(order3.toString() + "\n");

        System.out.println("Enter your First Name: ");
        String fName = input.nextLine();

        System.out.println("Enter your Last Name: ");
        String LName = input.nextLine();

        System.out.println("Enter your ZipCode Name: ");
        int zip = Integer.parseInt(input.nextLine());

        System.out.println("Enter your Crust Type: ");
        String crustType = input.nextLine();

        System.out.println("Enter your Size: ");
        String size = input.nextLine();

        System.out.println("Enter your toppings (separated by spaces): ");
        String topps = input.nextLine();
        String toppings[] = topps.split(" ");

        PizzaOrder order4 = new PizzaOrder(crustType, size, toppings, fName, LName, zip);
        System.out.println(order4.toString());

    }
}
