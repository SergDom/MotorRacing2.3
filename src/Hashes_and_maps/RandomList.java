package Hashes_and_maps;

import java.util.*;

public class RandomList {


    public static void main(String[] args) {

        Set<Integer> randomlist = new HashSet<>(20);


        fillArray(randomlist);
        System.out.println(randomlist);
    }

    private static void fillArray(Set<Integer> randomlist) {

        for (int i = 0; i < 20; i++) {
            double random = Math.random() * 1000;
            randomlist.add((int) random);
        }
        Iterator<Integer> iterator = randomlist.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 == 1) {
                iterator.remove();

            }
        }
    }
}





