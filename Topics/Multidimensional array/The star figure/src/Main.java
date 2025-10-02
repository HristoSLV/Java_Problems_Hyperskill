import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);

    }

    public static void printPattern(int n) {
        String[][] matrix = new String[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j || i == n / 2 || j == n / 2 || i + j == n - 1){
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
                System.out.print(matrix[i][j].concat(" "));
            }
            System.out.println();
        }

    }
}