package Proiect.MVC.Altul;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class StockController extends Observable {
    private List<Product> products;

    StockController(){
        products = new ArrayList<>();
    }

    public void AddProduct(Product p){
        System.out.println("Product " + p + " added!");
        setChanged();
        notifyObservers(p);
        products.add(p);
    }

    public List<Product> ViewProducts(){
        System.out.println("Products: " + products);
        setChanged();
        notifyObservers(products);
        return products;
    }

    public void DeleteProduct(Product p){
        setChanged();
        notifyObservers(p);
        products.remove(p);
        System.out.println("Product " + p + " removed!");
    }

    public void ChangeQuantity(Product p,int qnt){
        if(!(qnt == p.getQuantity())) {
            System.out.println("Product " + p + " changed the quantity!");
            p.setQuantity(qnt);
        }
        setChanged();
        notifyObservers(p);
    }
}
