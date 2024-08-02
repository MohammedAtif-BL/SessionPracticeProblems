package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithOutResource {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }

        } catch (IOException e ){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
