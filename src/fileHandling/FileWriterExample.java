package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try( FileWriter writer = new FileWriter("example1.txt")) {
           writer.write("Hello World");
           writer.write("\nExample for File Writer");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("example1.txt")){
            int character;
            while((character = reader.read()) != -1){
                System.out.print((char)character);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
