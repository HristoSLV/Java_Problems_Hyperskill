// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    String nameAnimal = "Pencil";
    String typeAnimal = "Cat";

    String firstAnimal = """
    name: %s
    type: %s
    """.formatted(nameAnimal, typeAnimal);

    String secondAnimal = String.format("name: %s\ntype: %s", nameAnimal, typeAnimal);

    //System.out.println(firstAnimal.equals(secondAnimal));
    System.out.println(firstAnimal);
    System.out.println(secondAnimal);
  }
}
