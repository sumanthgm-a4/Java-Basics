
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// To handle any resources (Eg.: Closing a database connection etc), Java 7
// introduced try-with-resources

public class TryWithResources {
    public static void main(String[] args) {
        // BufferedReader reader = null;

        // try {
        //     reader = new BufferedReader(new FileReader("example.txt"));
        //     String line;
        //     while ((line = reader.readLine()) != null)
        //         System.out.println(line);
        // } catch (IOException e) {
        //     System.out.println("IOException is caught: " + e.getMessage());
        // } finally {
        //     try {
        //         if (reader != null)
        //             reader.close();
        //     } catch (IOException e) {
        //         System.out.println("Error closing reader: " + e.getMessage());
        //     }
        // }


        // Closes the reader object automatically
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);

        } catch (IOException e) {
            System.out.println("IOException is caught: " + e.getMessage());
        }
    }
}
