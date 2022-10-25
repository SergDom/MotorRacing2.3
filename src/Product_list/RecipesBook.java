package Product_list;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipesBook {

    private final Set<Recipes> recipesBook;

    public RecipesBook() {
        recipesBook = new HashSet<>();
    }


    public void addRecipe(Recipes recipes) {
        if (recipesBook.contains(recipesBook)) {
            throw new RuntimeException("Такой рецепт уже имеется");
        } else {
            recipesBook.add(recipes);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipesBook that = (RecipesBook) o;
        return recipesBook.equals(that.recipesBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipesBook);
    }

    @Override
    public String toString() {
        return "Список рецептов: " + '\n' + recipesBook;
    }
}
