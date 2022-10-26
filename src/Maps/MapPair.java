package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapPair {

    // Задание 1.3

    Map<String, Integer> generate = new HashMap<>();

    public void addToMap(String string, Integer digit) {
        if (!generate.containsKey(string) && !generate.containsValue(digit)) {
            generate.put(string, digit);
        } else {
            throw new IllegalArgumentException("Значение существует");
        }
    }

    public void printMap() {
        for (Map.Entry<String, Integer> item : generate.entrySet()) {
            System.out.printf("Ключ: %s, Зачение: %s \n", item.getKey(), item.getValue());
        }
    }

    public static void main(String[] args) {

        MapPair mapPair = new MapPair();

        mapPair.addToMap("123", 1);
        mapPair.addToMap("234", 2);
        mapPair.addToMap("456", 3);
        mapPair.addToMap("567", 4);


        mapPair.printMap();
        System.out.println("=============================");
        mapPair.addToMap("567", 5);
        mapPair.printMap();



    }
}
