package ProductList;

import java.util.*;

public class RandomList {

    private static final Random fillObject = new Random();

    public static void main(String[] args) {

        Queue<Integer> randomlist = new ArrayDeque<>(20);


        fillArray(randomlist);
        System.out.println(randomlist);
    }

    private static void fillArray(Queue<Integer> randomlist) {
        int size = fillObject.nextInt(1000);
        for (int i = 0; i < size ; i++) {
//            int uneven = randomlist.get(i) % 2;
//            if (uneven != 0) {
//                randomlist.remove(i);
//            } else {
                randomlist.offer(fillObject.nextInt(randomlist.size()));

//                queue.offer(customers.get(fillObject.nextInt(customers.size())));
            }
        }
    }



