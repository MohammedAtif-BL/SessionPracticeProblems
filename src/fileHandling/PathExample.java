package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("example123.txt");

        System.out.println("Path: "+path);
        System.out.println("Absotule Path: " +path.toAbsolutePath());
        System.out.println("File Name: " +path.getFileName());
        System.out.println("Root: "+path.getRoot());

        try {
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("File Created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
