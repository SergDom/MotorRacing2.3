package ProductList;

import java.util.*;

public class RandomList {


    public static void main(String[] args) {

        ArrayList<Integer> randomlist = new ArrayList<>(20);


        fillArray(randomlist);
    }

    private static void fillArray(ArrayList<Integer> randomlist) {

        for (int i = 0; i < 20; i++) {
            randomlist.add(i, (int) (Math.random()*1000));
        }
        for (int i = 0; i < randomlist.size(); i++) {
            if (randomlist.get(i) % 2 == 0) {
                System.out.println(randomlist.get(i));
            } else {
                randomlist.remove(i);
            }
        }
    }

}




