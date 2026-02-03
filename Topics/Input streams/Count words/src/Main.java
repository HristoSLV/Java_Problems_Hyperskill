import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String line = reader.readLine().strip();

        if (line.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = line.split("\\s+");
            System.out.println(words.length);
        }

        reader.close();
    }
}