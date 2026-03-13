// You can experiment here, it won’t be checked

import com.sun.tools.javac.Main;

import java.lang.reflect.InvocationTargetException;

public class Task {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    // put your code here
    Task.class.getMethod("hello").invoke(null);
  }

  public static void hello() {
    System.out.println("Hello world!");
  }
}
