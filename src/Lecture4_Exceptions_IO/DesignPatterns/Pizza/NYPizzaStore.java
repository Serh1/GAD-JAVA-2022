package Lecture4_Exceptions_IO.DesignPatterns.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        switch (type){
            case "Cheese": return new NYstyleCheseePizza();
            case "Peperoni": return new PeperoniPizza();
            default: return null;
        }
    }
}
