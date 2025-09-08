import java.io.*;

// Similar to Python's "w" mode - overwrite

public class WriteToAFile {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("test.txt", false)) {
            fw.write("Hello, Java!\n");
        }
    }
}
