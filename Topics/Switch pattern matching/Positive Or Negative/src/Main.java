import java.util.Scanner;

public class Main {
    // implement the method below
    public static void checkNumber(Object o) {
        System.out.println(switch (o) {
            case Integer i when i > 0   -> "Positive integer";
            case Integer i when i == 0  -> "Zero";
            case Integer ignored        -> "Negative integer";
            default                     -> "Not an integer";
        });
    }

    // please do not change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            checkNumber(number);
        } catch (NumberFormatException e) {
            checkNumber(input);
        }

        scanner.close();
    }
}