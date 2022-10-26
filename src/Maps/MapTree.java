package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTree {
    Map<Integer, String> tree = new LinkedHashMap<>();


    public void addToTree(String name) {
        for (int i = 0; i < 10; i++) {
            Integer digit = ((int) (Math.random() * 1000));
            tree.put(digit, name + " " + i);
        }

    }
    public void printTree() {
        for (Map.Entry<Integer, String> item : tree.entrySet()) {
            System.out.printf("Ключ: %s, Значение: %s \n", item.getKey(), item.getValue());
        }
    }
    public static void main(String[] args) {
        MapTree mapTree = new MapTree();

        mapTree.addToTree("Строка");
        mapTree.printTree();
    }

}
