package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    // Задание 2.1
    public static void main(String[] args) {

        Map<String, List<Integer>> external = new HashMap<>();
        String string = "String ";
        for (int i = 0; i < 5; i++) {
            List<Integer> internal = new ArrayList<>();
            internal.add((int) (Math.random() * 1000));
            internal.add((int) (Math.random() * 1000));
            internal.add((int) (Math.random() * 1000));
            external.put(string + i, internal);
        }
        System.out.println(external);
        System.out.println(external.get("String 2"));

        System.out.println("=======================");
        Map<String, Integer> convertedMap = new HashMap<>();
        for (String name : external.keySet()) {
            int summ = 0;
            List<Integer> forIteration = external.get(name);
            for (int j = 0; j < forIteration.size(); j++) {
                summ = summ + forIteration.get(j);
            }

            convertedMap.put(name, summ);
            System.out.println(convertedMap);
        }
    }

}
