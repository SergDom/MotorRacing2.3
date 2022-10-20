package ProductList;

public class Main {

    public static void main(String[] args) {


        Product potato = new Product("Картошка", 35.50, 1.00);
        Product carrot = new Product("Морковь", 23.15, 2.10);
        Product onion = new Product("Лук", 0.75, 0.50);
        Product tomato = new Product("Помидор", 45.00, 1.50);
        Product banana = new Product("Банан", 15.34, 1.40);

        ShoppingList item = new ShoppingList();

        item.addList(potato);
        item.addList(carrot);
        item.addList(onion);
        item.addList(tomato);
        item.addList(banana);

//        item.printInfo();
//
//        Recipes salad = new Recipes("Салат");
//        salad.addRecipes();








    }
}
