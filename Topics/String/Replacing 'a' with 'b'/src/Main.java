import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String givenString = scanner.nextLine();
        String result = givenString.replaceAll("a", "b");
        System.out.println(result);
        scanner.close();
    }
}