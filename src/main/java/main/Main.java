package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));
        DecoroPizza decoroPizza = new DecoroPizza(34, Arrays.asList("ham", "champignons", "pepper", "onion"));

        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();
    }

}
