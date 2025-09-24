import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        if (n > s.length()) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(n) + s.substring(0, n));
        }
    }
}