package Product_list;

import java.util.*;

public class ShoppingList {

    private Map<Product, Double> list = new HashMap<>();


    public void removeList(Product product) {

        list.remove(product);
    }

    public void addList(Product product) {
        if (list.containsValue(product)) {
            throw new IllegalArgumentException("Такой товар уже есть в листе покупок" + product.getName());
        } else {

            list.put(product, product.getWeight());
        }
    }

    public double sumOfProducts() {
        double sum = 0;
        for (Map.Entry<Product, Double> listEntry : list.entrySet()) {
            sum = sum + (listEntry.getKey().getPrice() * listEntry.getValue());
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingList that = (ShoppingList) o;
        return list.equals(that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Список продуктов: " + list;
    }
}

