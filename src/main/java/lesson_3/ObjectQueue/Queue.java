package lesson_3.ObjectQueue;

import java.util.Scanner;

public class Queue {
    public static void main(String[] arg) {
        ObjectQueue queue = new ObjectQueue();

        for (int i = 0; i < 10; i++) {
            Scanner p = new Scanner(System.in);
            System.out.println("Строка:" + i + " - введите приоритетность");

            int pr = p.nextInt();

            queue.pushWithPr("Строка:" + i, pr);

        }


        while (queue.size() > 0) {
            String s = (String) queue.pullHead();

            System.out.println(s);

            System.out.println("Размер очереди:" + queue.size());


        }


    }
}