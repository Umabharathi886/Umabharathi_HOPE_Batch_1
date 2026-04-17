
import java.io.FileWriter;

public class FilewriterEx{
    public static void main(String[] args){
        try {
            FileWriter writer = new FileWriter("hope_batch_1.txt");
            writer.write("welcome to filehandling");
            writer.close();
        } catch (Exception e) {
        }
    }
}