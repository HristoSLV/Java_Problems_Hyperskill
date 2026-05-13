import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean weekdayParty = cups >= 10 && cups <= 20 && !isWeekend;
        boolean weekendParty = cups >= 15 && cups <= 25 && isWeekend;
        boolean successfulParty = weekdayParty || weekendParty;

        System.out.println(successfulParty);
        scanner.close();
    }
}