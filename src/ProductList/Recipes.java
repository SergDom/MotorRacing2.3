package ProductList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    private final String receipeName;
    private final double totalSum;
    private final ShoppingList products;

    Set<Recipes> recipeslist = new HashSet<>();

    public Recipes(String receipeName, ShoppingList products) {
        if (receipeName == null || receipeName.isEmpty()) {
            throw new NullPointerException("Укажите название рецепта");
        } else {
            this.receipeName = receipeName;
        }

        totalSum = products.sumOfProducts();

        if (products == null) {
            throw new NullPointerException("Нет рецептов !!!!");
        } else {

            this.products = products;
        }
    }

    public void addRecipes(Recipes recipes) {
        for (Recipes recipes1 : recipeslist) {
            if (recipes1.equals(recipes)) {
                throw new UnsupportedOperationException("Такой трецепт уже есть" + getReceipeName());
            }
        }
        recipeslist.add(recipes);
    }


    public String getReceipeName() {
        return receipeName;
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
        return Objects.equals(receipeName, recipes.receipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receipeName);
    }

    @Override
    public String toString() {
        return "Название рецепта: " + receipeName;
//        + '\n' +  " стоимость " + totalSum + " " + products;
    }
}
