package fileHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileNIOExample {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String copyFileName = "test_copy.txt";
        writeFile(fileName);
        readFile(fileName);
        copyFile(fileName,copyFileName);
    }

    public static void copyFile(String fileName, String copyFileName) {
        Path sourcefilePath = Paths.get(fileName);
        Path destinationfilePath = Paths.get(copyFileName);
        try{
            Files.copy(sourcefilePath,destinationfilePath, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        Path filePath = Paths.get(fileName);
        try{
            String content = Files.readString(filePath);
            System.out.println(content);

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void writeFile(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            Files.write(filePath,"Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
