package holding_object;

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }

}

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        for (String s : "wendy is a black dog".split(" ")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }



    }


}


