import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed abstract class Shape permits Square {
    abstract double getArea();
}

final class Square extends Shape {

    private final double radius;

    public Square(double rad) {
        radius = rad;
    }

    @Override
    double getArea() {
        return radius * radius;
    }
}