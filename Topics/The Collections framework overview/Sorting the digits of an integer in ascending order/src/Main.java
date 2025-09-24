import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Write your code here.
        System.out.println(convertToList(number));

    }

    public static List<Integer> convertToList(int number) {
        // Write your code here.
        List<Integer> digits = new ArrayList<>();

        while (number != 0) {
            digits.add(number % 10);
            number /= 10;
        }

        Collections.sort(digits);
        return digits;
    }
}