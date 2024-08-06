package fileHandling;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example1.txt",false))){
            writer.write("Example for Buffered Writer");
            writer.write("\nFile Handling Exmaple");
        }catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("example1.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
