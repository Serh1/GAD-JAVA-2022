package Lecture4.DesignPatterns.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore myPizzaStore = new NYPizzaStore();
        Pizza myCheesePizza = myPizzaStore.orderPizza("Cheese");
        Pizza myPeperoniPizza = myPizzaStore.orderPizza("Peperoni");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.createPizza("Cheese");
    }
}
