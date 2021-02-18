package com.nondas.company;

public class Main {

    public static void main(String[] args) {


        Customer nondas = new Customer("Nondas", "Fredo Espresso");
        Customer psarakas = new Customer("nikos", "Ice latte caramel");
        Customer stauri = new Customer("Stauri","Frappe");
        Customer giannis = new Customer("Giannis", "filter coffe");

        CoffeAttendent employee = new CoffeAttendent();


//
        employee.takeOrder(nondas);
        employee.takeOrder(nikos);
        employee.takeOrder(stauri);
        employee.takeOrder(giannis);




        employee.drinksToBePrepared();

        employee.prepareDrink(nondas);

        employee.drinksToBePrepared();

        employee.prepareDrink(stauri);

        employee.drinksToBePrepared();

        employee.prepareDrink(psarakas);





    }
}
