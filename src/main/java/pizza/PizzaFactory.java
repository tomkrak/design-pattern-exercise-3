package pizza;

import java.util.List;

public class PizzaFactory {

    public Pizza cretepizza (PizzaBrand brand, double cost, List<String> components){
        if(brand.equals(PizzaBrand.MARGERITTA)){
            return new MargheritaPizza(cost,components);
        }else if(brand.equals(PizzaBrand.HAWAI)){
            return new HawaiPizza(cost,components);
        }else if(brand.equals(PizzaBrand.CAPRICIOSA)){
            return new CapriciosaPizza(cost,components);
        }else return null;
    }
}
