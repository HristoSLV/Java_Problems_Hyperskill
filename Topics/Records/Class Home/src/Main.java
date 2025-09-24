import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Home home = new Home(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(home);
    }
}

record Home(String address, String city, String state, String zipCode) {

    public Home{
        address = address.toUpperCase(Locale.ENGLISH);
        city = city.toUpperCase(Locale.ENGLISH);
        state = state.toUpperCase(Locale.ENGLISH);
        zipCode = Objects.requireNonNullElse(zipCode, "unknown");

    }

}