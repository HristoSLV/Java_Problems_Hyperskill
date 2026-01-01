import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        // write your code here
        String[] words = line.split("[^A-Za-z]+");

        boolean found = false;

        for (String w : words) {
            if (w.length() == size) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}