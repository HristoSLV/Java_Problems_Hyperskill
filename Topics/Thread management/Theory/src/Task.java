// You can experiment here, it won’t be checked

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task {
  public static void main(String[] args) {
    // put your code here
      String digits = new Scanner(System.in).nextLine();

      int[] count = new int[10];

      // Count digits
      for (char c : digits.toCharArray()) {
          if (Character.isDigit(c)) {
              count[c - '0']++;
          }
      }

      // Create list of pairs (digit, count)
      List<int[]> freqList = new ArrayList<>();
      for (int i = 0; i < count.length; i++) {
          freqList.add(new int[]{i, count[i]});
      }

      // Sort descending by count
      freqList.sort((a, b) -> Integer.compare(b[1], a[1]));

      // Print sorted results
      System.out.println("Digits sorted by frequency (highest first):");
      for (int[] pair : freqList) {
          System.out.println("Digit " + pair[0] + ": " + pair[1]);
      }
  }
}
