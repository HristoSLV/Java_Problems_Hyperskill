import java.util.Scanner;

public class Main{

    public static void printPattern(int n) {
        // You should declare a two-dimensional array here.

        // You should write a nested for loop to iterate over element in the array.
        // In the for loop you can identify the positions that should hold '#' and ' '.

        // You should print out the elements of each row of the array. Use 'System.out.print'
        // to avoid automatic newline after every element and 'System.out.println'
        // at the end of every row to print a newline.

        String[][] matrix = new String[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j || i + j == n - 1) {
                    matrix[i][j] = "#";
                } else {
                    matrix[i][j] = " ";
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
}