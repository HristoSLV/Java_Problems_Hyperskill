import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String line = reader.readLine().trim();

        if (line.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = line.split("\\s+");
            System.out.println(words.length);
        }

        reader.close();
    }
}