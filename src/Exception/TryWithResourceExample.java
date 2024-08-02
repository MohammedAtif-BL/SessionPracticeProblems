package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            FileWriter write = new FileWriter("output.txt")
            ){
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }

        } catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
