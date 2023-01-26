package com.techelevator;

public class PizzaDelivery {
    private String firstName;
    private String lastName;
    private int zipCode;
    private double deliveryPrice;

    public PizzaDelivery(String firstName, String lastName, int zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public PizzaDelivery() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getFullName() {
        return this.lastName + ", " + this.firstName;
    }

    public double calculateDeliveryPrice() {
        if (this.zipCode == 48120) {
            this.deliveryPrice = 2.00;
            return 2.00;
        }
        else if (this.zipCode == 48124) {
            this.deliveryPrice = 3.00;
            return 3.00;
        }
        else if (this.zipCode == 48128) {
            this.deliveryPrice = 5.00;
            return 5.00;
        }
        else {
            setZipCode(48120);
            return 2.00;
        }
    }
}
