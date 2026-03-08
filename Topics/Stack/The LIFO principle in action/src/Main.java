import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            deque.addFirst(scanner.nextLine());
        }

        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
        }
    }
}