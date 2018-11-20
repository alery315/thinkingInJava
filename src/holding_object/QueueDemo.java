package holding_object;

import java.util.*;

public class QueueDemo {

    public static void printQueue(Queue queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(22);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
        }
        printQueue(queue);
        Queue<Character> queue1 = new LinkedList<>();
        for (Character character : "Hello,world.".toCharArray()) {
            queue1.add(character);
        }
        printQueue(queue1);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        // 默认升序
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        printQueue(priorityQueue);





    }

}
