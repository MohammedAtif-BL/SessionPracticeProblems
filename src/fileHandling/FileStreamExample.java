package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {

        try (FileOutputStream outputStream = new FileOutputStream("example1.txt")){
            outputStream.write("File Handling Using FileOutPutStream".getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream inputStream = new FileInputStream("example1.txt")){
            int data;
            while ((data = inputStream.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
