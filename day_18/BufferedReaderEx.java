import java.io.*;
public class BufferedReaderEx{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("hope_batch_1.txt"));
             System.out.println(reader.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}