import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile2 {
    public static void main(String[] args) throws IOException {
        try (FileWriter fr = new FileWriter("test.txt", true)) {
            fr.write("\n\nHello new world");
        }
    }
}
