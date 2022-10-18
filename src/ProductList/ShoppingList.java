package ProductList;

import java.util.HashSet;
import java.util.Set;

public class ShoppingList {

    Set<Product> list = new HashSet<>();


    public void removeList(Product product) {
        list.remove(product);
    }

    public void addList(Product product) {
        for (Product product1 : list) {
            if (product.name.equals(product1.name))
                throw new UnsupportedOperationException("Такой товар уже есть в листе покупок");
            list.add(product);
        }


    }

    public void printinfo() {
        for (Product product1 : list) {
            System.out.println(product1.getName());
        }
    }
}

