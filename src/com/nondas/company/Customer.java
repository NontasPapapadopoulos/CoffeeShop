package com.nondas.company;

public class Customer implements WaitingCustomer{
    private String name;
    private String drinkOrdered;
    private boolean hasOrdered = false;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public boolean HasOrdered() {
        return hasOrdered;
    }

    public void setHasOrdered(boolean hasOrdered) {
        this.hasOrdered = hasOrdered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setDrinkOrdered(String drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }


    @Override
    public void orderReady(String preparedDrink) {
        System.out.println(name + ": Thanks for the " + preparedDrink + ", \n Goodbye!");
        hasOrdered = true;
    }
}
