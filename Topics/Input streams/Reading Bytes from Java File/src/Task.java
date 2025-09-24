// You can experiment here, it won’t be checked

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Task {
  public static void main(String[] args) throws IOException {
    // put your code here

      FileInputStream fileStream = new FileInputStream(new File("input.txt"));
      byte[] byteArray = new byte[100];
      int bytesRead = fileStream.read(byteArray);

  }
}
