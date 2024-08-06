package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileExmaple {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if(file.exists()){
            System.out.println("File Already Exists");
        } else {
            try {
                file.createNewFile();
                System.out.println("File Created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(file.isDirectory()){
            System.out.println("It's a Directory");
        } else {
            System.out.println("It's a File");
        }

        System.out.println("File Name: " +file.getName());
        System.out.println("Absolute Path: "+ file.getAbsolutePath());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Readable: " +file.canRead());
        System.out.println("FIle Size:" +file.length());
    }
}
