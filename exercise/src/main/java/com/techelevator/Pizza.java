package com.techelevator;

public class Pizza {

    private String crustType;
    private String size;
    private String toppings[] = new String[]{"none"};
    private double price;
    private boolean isSpecialty;

    private static final double SMALL = 6.99;
    private static final double MEDIUM = 8.99;
    private static final double LARGE = 10.99;
    private static final double X_LARGE = 11.99;
    private static final double JUMBO = 13.99;

    public Pizza() {
    }

    public Pizza(String crustType, String size, String[] toppings) {
        this.crustType = crustType;
        this.size = size;
        this.toppings = toppings;
    }

    public boolean isSpecialty() {
        return isSpecialty;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public String getToppingsAs() {
        String word = "";
        for (int i = 0; i < toppings.length; i++) {
            word += toppings[i];
            if (i < toppings.length -1) {
                word += ", ";
            }
        }
        return word;
    }

    public double calculatePrice(){
        double total = 0;
        if (toppings.length <= 2) {

        }
        else {
            // The oracle
            if (toppings.length == 8) {
                isSpecialty = true;
                total += 5;
            }
            // The RAM
            else if (toppings.length == 3) {
                boolean hasPeppers = false;
                boolean hasTomatoes = false;
                boolean hasMushrooms = false;
                for (int j = 0; j < toppings.length; j++) {
                    if (toppings[j].equals("RoastedPeppers")) {
                        hasPeppers = true;
                    }
                    else if (toppings[j].equals("Mushrooms")) {
                        hasMushrooms = true;
                    }
                    else if (toppings[j].equals("Tomatoes")) {
                        hasTomatoes = true;
                    }
                }
                if (hasMushrooms && hasPeppers && hasTomatoes) {
                    isSpecialty = true;
                    total += 5;
                }
                else {
                    total = total + ((toppings.length - 2) * 0.75);
                }
            }
            // The Nerd
            else if (toppings.length == 4) {
                boolean hasPeppers = false;
                boolean hasFeta = false;
                boolean hasBasil = false;
                boolean hasChicken = false;
                for (int j = 0; j < toppings.length; j++) {
                    if (toppings[j].equals("RoastedPeppers")) {
                        hasPeppers = true;
                    }
                    else if (toppings[j].equals("Chicken")) {
                        hasChicken = true;
                    }
                    else if (toppings[j].equals("Basil")) {
                        hasBasil = true;
                    }
                    else if (toppings[j].equals("Feta")) {
                        hasFeta = true;
                    }
                }
                if (hasBasil && hasPeppers && hasChicken && hasFeta) {
                    isSpecialty = true;
                    total += 5;
                }
                else {
                    total = total + ((toppings.length - 2) * 0.75);
                }
            }
            else {
                total = total + ((toppings.length - 2) * 0.75);
            }

        }
        // Crust
        if (getCrustType().equals("Plain") || getCrustType().equals("Whole Wheat")) {

        }
        else if (getCrustType().equals("Parmesan")) {
            total += 0.50;
        }
        else {
            total += 1.00;
        }
        // Size

        if (getSize().equals("Small")) {
            total += SMALL;
        }
        else if (getSize().equals("Medium")) {
            total += MEDIUM;
        }
        else if (getSize().equals("Large")) {
            total += LARGE;
        }
        else if (getSize().equals("X-Large")) {
            total += X_LARGE;
        }
        else if (getSize().equals("Jumbo")) {
            total += JUMBO;
        }

        return total;
    }

}
