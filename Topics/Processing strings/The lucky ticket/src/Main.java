import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String ticket = sc.nextLine();

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < ticket.length() / 2; i++) {
            sumFirstHalf += Character.getNumericValue(ticket.charAt(i));
        }

        for (int i = ticket.length() / 2; i < ticket.length(); i++) {
            sumSecondHalf += Character.getNumericValue(ticket.charAt(i));
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}