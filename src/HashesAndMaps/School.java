package HashesAndMaps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class School {
    private final Set<String> tasks = new HashSet<>(15);

    public School() {
        Random rand = new Random();

        while (tasks.size() < 16) {
            int a = rand.nextInt(7) +2;
            int b = rand.nextInt(7) +2;
            if (!tasks.contains(a + " * " + b) && !tasks.contains(b + " * " + a) ){
                tasks.add(a + " * " + b);
            }
        }
    }

    public void printTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        School st = new School();
        st.printTasks();
    }
}

