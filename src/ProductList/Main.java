package ProductList;

public class Main {

    public static void main(String[] args) {


        Product potato = new Product("Картошка", 35.50, 1.00);
        Product onion = new Product("Лук", 0.75, 0.50);
        Product mashrooms = new Product("Грибы", 21.40, 1.25);

        Product spagetti = new Product("Спагетти", 3.50, 0.45);
        Product eggs = new Product("Яйца", 2.75, 0.50);
        Product bacon = new Product("Бекон", 5.90, 0.30);


        ShoppingList list1 = new ShoppingList();

        list1.addList(potato);
        list1.addList(onion);
        list1.addList(mashrooms);

        ShoppingList list2 = new ShoppingList();
        list2.addList(spagetti);
        list2.addList(eggs);
        list2.addList(bacon);


//        item.printInfo();
//
        Recipes jareckha = new Recipes("Жареха", list1);
        Recipes carbonara = new Recipes("Паста Карбонара", list2);

        RecipesBook recipesBook = new RecipesBook();
        recipesBook.addRecipe(jareckha);
        recipesBook.addRecipe(carbonara);

        System.out.println(recipesBook);








    }
}
