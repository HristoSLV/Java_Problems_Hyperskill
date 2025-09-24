import java.util.*;

class FixingStringIndexOutOfBounds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int i = scanner.nextInt();

        if ((i < 0) || (i >= s.length())){
            System.out.println("Out of bounds!");
        } else {
            System.out.println(s.charAt(i));
        }
    }
}