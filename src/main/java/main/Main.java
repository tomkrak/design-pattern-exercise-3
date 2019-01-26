package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CapriciosaPizza capriciosaPizza = new CapriciosaPizza();
        HawaiPizza hawaiPizza = new HawaiPizza();

        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();

        PizzaFactory pizzaZam1 = new PizzaFactory();
        Pizza pizza1Stolik11 =pizzaZam1.cretepizza(PizzaBrand.MARGERITTA
                ,34, Arrays.asList("chess"));
        Pizza pizza1Stolik15 = pizzaZam1.cretepizza(PizzaBrand.HAWAI
                ,34, Arrays.asList("anans","ham","chees"));

    }

}
