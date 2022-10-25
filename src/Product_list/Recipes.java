package Product_list;

import java.util.Objects;

public class Recipes {
    private final String recipeName;
    private final double totalSum;
    private final ShoppingList products;


    public Recipes(String recipeName, ShoppingList products) {
        if (recipeName == null || recipeName.isEmpty()) {
            throw new IllegalArgumentException("Укажите название рецепта");
        } else {
            this.recipeName = recipeName;
        }

        totalSum = products.sumOfProducts();

        if (products == null) {
            throw new IllegalArgumentException("Нет рецептов !!!!");
        } else {
            this.products = products;
        }
    }

    public String getRecipeName() {
        return recipeName;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public ShoppingList getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return "Название рецепта: " + recipeName
        +  " стоимость " + totalSum + " продукты " + products + '\n' ;
    }


}
