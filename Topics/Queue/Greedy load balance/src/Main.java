import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int numberOfTasks = sc.nextInt();

        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();

        int load1 = 0;
        int load2 = 0;

        for (int i = 1; i <= numberOfTasks; i++) {
            int taskId = sc.nextInt();
            int currentTaskLoad = sc.nextInt();

            if (load1 <= load2) {
                queue1.offer(taskId);
                load1 += currentTaskLoad;
            } else {
                queue2.offer(taskId);
                load2 += currentTaskLoad;
            }
        }

        for (var element : queue1) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (var element : queue2) {
            System.out.print(element + " ");
        }

    }
}