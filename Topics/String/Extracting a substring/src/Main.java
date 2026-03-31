import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String result;

        if (start >= 0 && start < string.length()
                && end >= 0 && end < string.length()) {
            // The end point of substring is exclusive therefore it needs +1
            result = string.substring(start, end + 1);
            System.out.println(result);
        }
    }
}