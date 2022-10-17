package ProductList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    final String name;
    double price;
    double weight;

    private Set<Product> list;

    public Product(String name, double price, double weight) {
        this.name = name;
        setPrice(price);
        setWeight(weight);
        list = new HashSet<>();
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        if (weight <= 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.weight = price;
        }
    }


    public Set <Product> add () {
        return list;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (Objects.equals(name, product.name))
            throw new UnsupportedOperationException("Такой товар уже есть в листе покупок");
        return false;
    }

    @Override
    public String toString() {
        return "Продукт:" + name + " цена: " + price + " вес: " + weight + " кг";
    }


    public static void main(String[] args) {
        Set <Product> product = new HashSet<>();
        product.add(new Product("Картошка", 35.50, 1.00));
        product.add(new Product("Морковь", 23.15, 2.10));
        product.add(new Product("Лук", 0.75, 0.50));
        product.add(new Product("Помидор", 45.00, 1.50));
        product.add(new Product("Банан", 15.34, 1.40));
//        product.add(new Product("Банан", 15.34, 1.40));



        System.out.println(product);


    }
}