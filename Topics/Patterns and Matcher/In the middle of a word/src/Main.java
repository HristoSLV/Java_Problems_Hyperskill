import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine().trim().toLowerCase();
        String line = scanner.nextLine();

        // write your code here
        String[] words = line.split("[^A-Za-z]+");

        for (String w : words) {
            String word = w.toLowerCase();

            if (word.contains(part)) {
                if (!word.startsWith(part) && !word.endsWith(part)) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");

    }
}