package ProductList;


import java.util.Objects;


public class Product {

    final String name;
    double price;
    double weight;


    public Product(String name, double price, double weight) {
        this.name = name;
        setPrice(price);
        setWeight(weight);
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
            this.weight = weight;
        }
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
        return Double.compare(product.price, price) == 0 && Double.compare(product.weight, weight) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Продукт:" + name + " ,цена: " + price + " ,вес: " + weight + " кг";
    }


}