import java.util.*;

public class DataStructures {
    public static void main(String[] args) {

        // Список
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);

        System.out.println(list.isEmpty());
        System.out.println(list.get(2));


        // Стек
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);

        System.out.println(stack.pop());
        System.out.println(stack.size());


        // Очередь
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(10);
        queue.offer(11);
        queue.offer(12);
        queue.offer(13);

        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
