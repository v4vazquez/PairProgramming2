package com.techelevator;

public class PizzaOrder {
    private Pizza order;
    private PizzaDelivery delivery;

    public PizzaOrder(String crust, String size, String[] toppings, String firstName, String lastName, int zipCode) {
        this.order = new Pizza(crust, size, toppings);
        this.delivery = new PizzaDelivery(firstName, lastName, zipCode);
    }

    public Pizza getOrder() {
        return order;
    }

    public void setOrder(Pizza order) {
        this.order = order;
    }

    public PizzaDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(PizzaDelivery delivery) {
        this.delivery = delivery;
    }

    private double calculatePizzaOrder() {
        double finalPrice = this.order.calculatePrice() + this.delivery.calculateDeliveryPrice();
        if (this.order.isSpecialty()) {
            return ((.90) * finalPrice);
        }
        else {
            return finalPrice;
        }

    }

    public String toString() {
        String finalStr = "";
        finalStr += String.format("The Price for this order is %.2f", this.calculatePizzaOrder());
        finalStr += "\n Crust: " + this.order.getCrustType();
        finalStr += "\n Size: " + this.order.getSize();
        finalStr += "\n Toppings: " + this.order.getToppingsAs();
        finalStr += "\n FirstName: " + this.delivery.getFirstName();
        finalStr += "\n LastName: " + this.delivery.getLastName();
        finalStr += "\n ZipCode: " + this.delivery.getZipCode();
        finalStr += "\n IsSpecialty: " + this.order.isSpecialty();


        return finalStr;
    }
}
