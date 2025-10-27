import java.util.Scanner;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // start coding here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

        if (Pattern.matches(regex, input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}