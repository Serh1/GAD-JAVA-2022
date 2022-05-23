package Proiect.MVC.Altul;



import java.util.Observable;
import java.util.Observer;

public class Stock implements Observer {
    public static void main(String[] args) {
        Product product1 = new Product("Milk",100,  4.5);
        Product product2 = new Product("Brownies",50,  2.5);
        StockController stockController = new StockController();
        Stock stock = new Stock();
        product1.addObserver(stock);
        product2.addObserver(stock);

        stockController.AddProduct(product1);
        stockController.AddProduct(product2);

        stockController.ViewProducts();

        stockController.DeleteProduct(product1);

        stockController.ViewProducts();

        stockController.ChangeQuantity(product2,500);

        stockController.ViewProducts();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Updated");
    }
}
