package Assignment1;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void WriteLine(String line, String path){
        try {
            FileWriter file = new FileWriter(path,true);
            file.write(line + "\n");
            file.close();
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}