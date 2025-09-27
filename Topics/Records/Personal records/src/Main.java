import java.util.Scanner;

record Person(String name, int age, String gender) {
  //don't change this record

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String gender() {
        return gender;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.next(), scanner.nextInt(), scanner.next());

        // your code goes here
        System.out.println(person.name() + " is " + person.age() + " years old and is " + person.gender());

    }
}