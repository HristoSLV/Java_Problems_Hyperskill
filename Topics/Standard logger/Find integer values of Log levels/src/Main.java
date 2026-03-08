import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] levels = sc.nextLine().strip().split("\\s+");
        int totalValue = 0;

        for (String levelName : levels) {
            String upperCaseLevel = levelName.toUpperCase();

            try {
                Level level = Level.parse(upperCaseLevel);
                int levelValue = level.intValue();
                totalValue += levelValue;
            } catch (IllegalArgumentException e) {
                System.out.println("Level " + levelName + " does not exist");
            }
        }

        System.out.println(totalValue);

    }
}