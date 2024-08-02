package Exception.throwExample;

import java.io.IOException;

public class Throws1Example3 {
    public static void main(String[] args) {
        try {
            readFile("demo.txt");
            writeFile("writeTOFile.txt");
        } catch (IOException e ){
            System.out.println(e.getMessage());
        }

        System.out.println("REst of the code ");
    }

    public static void readFile(String fileName) throws IOException{
            if (!fileName.equals("test.txt")) {
                throw new IOException("File Not found to read");
            }
    }

    public static void writeFile(String fileName) throws IOException{

            if (!fileName.equals("test.txt")) {
                throw new IOException("File Not found to write");
            }

    }
}
