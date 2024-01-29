package aliona.oldprojects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriterReader {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("text");
        writer.println("OLEG");
        writer.close();

        try (FileWriter fileWriter = new FileWriter("text", true)){
            fileWriter.append("OlEG2");
        } catch (Exception ignored) {}

    }
}
