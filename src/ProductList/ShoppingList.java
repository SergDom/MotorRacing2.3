package ProductList;

import java.util.HashSet;
import java.util.Set;

public class ShoppingList {

    private Set<Product> list = new HashSet<>();


    public void removeList(Product product) {
        list.remove(product);
    }

    public void addList(Product product) {
        for (Product product1 : list) {
            if (product.getName().equals(product1.getName()))
                throw new IllegalArgumentException ("Такой товар уже есть в листе покупок");}
        list.add(product);
    }

    public double sumOfProducts() {
        double sum = 0;
        for (Product cost : list) {
            sum = sum + (cost.getPrice() * cost.getWeight());
        }
        return sum;
    }


    public void printInfo() {
        for (Product product : list) {
            System.out.println(product.getName());
        }
    }

    @Override
    public String toString() {
        return "Список продуктов: " + list;
    }
}

