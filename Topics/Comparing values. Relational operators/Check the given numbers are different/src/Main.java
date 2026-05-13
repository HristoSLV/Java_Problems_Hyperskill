import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isDifferent1 = a != b;
        boolean isDifferent2 = a != c;
        boolean isDifferent3 = b != c;

        System.out.println(isDifferent1 && isDifferent2 && isDifferent3);
    }
}