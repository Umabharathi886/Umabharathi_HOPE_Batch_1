import java.io.*;
public class BufferedWriterEx{
    public static void main(String[] args) {
        try {
BufferedWriter writer = new BufferedWriter(new FileWriter("hope_batch_1.txt",true));
     writer.newLine();
    writer.write("Here we have turned the file writer with true to append the data in the file");
    writer.newLine();
    writer.write("Finally,i have closed the appening and writing operation   Now i am closing the file");
    writer.close();
        } catch (Exception e) {
        }
    }
}