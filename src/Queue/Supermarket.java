package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class Supermarket {
    private static final List<String> customers = List.of(
            "Арсений Игнатьев",
            "Давид Дмитриев",
            "Милана Васильева",
            "Андрей Борисов",
            "Полина Филатова",
            "Тимофей Новиков",
            "Анастасия Глебова",
            "Егор Филимонов",
            " Сергей Медведев",
            "Ева Орлова");

    private static final Random fillObject = new Random();

    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedBlockingQueue<>(5);
        Queue<String> queue2 = new LinkedBlockingQueue<>(5);
        fillQueue(queue1);
        fillQueue(queue2);

        System.out.println("Первая очередь" + queue1);
        System.out.println("Вторая очередь" + queue2);
        addCustomer("Иван",queue1,queue2);
        System.out.println("Первая очередь" + queue1);
        System.out.println("Вторая очередь" + queue2);
    }

    private static void fillQueue(Queue<String> queue) {
        int size = fillObject.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(customers.get(fillObject.nextInt(customers.size())));
        }
    }

    private static void addCustomer(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() < queue2.size() && queue2.size()!=fillObject.nextInt(6)) {
            queue1.add(name);
        } else if (queue2.size() < queue1.size() && queue1.size()!=fillObject.nextInt(6)) {
            queue2.add(name);
        }
        else {
            System.out.println("Зовите Галю !!!!");
        }
    }


}



