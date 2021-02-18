package com.nondas.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CoffeAttendent {

    private String completedDrink;
    private final List<Customer> waitingCustomers;
    private final List<String> orderedDrinks;

    public CoffeAttendent() {
        this.waitingCustomers = new ArrayList<>();
        this.orderedDrinks = new ArrayList<>();
    }


    public void takeOrder(Customer customer) {
        if(!customer.HasOrdered()) {
            waitingCustomers.add(customer);
            orderedDrinks.add(customer.getDrinkOrdered());
            System.out.println(customer.getName() + " ordered " + customer.getDrinkOrdered());
            customer.setHasOrdered(true);
        } else {
            System.out.println(customer.getName() + " you have already ordered, please wait in the queue");
        }
    }


    public void prepareDrink (Customer customer)  {
        System.out.println("Employee: Now preparing " + customer.getDrinkOrdered() + " ...");

        //TimeUnit.SECONDS.sleep(2);

        System.out.println("Employee: The drink is ready! ");
        completedDrink = customer.getDrinkOrdered();
        orderedDrinks.remove(completedDrink);
        callOutCompletedOrder(completedDrink, customer);
    }



    private void callOutCompletedOrder(String drink, Customer customer) {
        customer.orderReady(drink);
        waitingCustomers.remove(customer);
    }

    public void drinksToBePrepared() {
        System.out.println("\n===Drinks in the waiting list===");
        for(var drink : orderedDrinks) {
            System.out.println(drink);
        }
        System.out.println("================");
    }



}
