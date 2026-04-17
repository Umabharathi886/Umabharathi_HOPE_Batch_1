import java.io.*;
public class FilereaderEx{
    public static void main(String[] args){
        try{
        FileReader reader = new FileReader("hope_batch_1.txt");
       /* int character;
        while((character = reader.read()) != -1){
             System.out.print((char) character);
        }*/
       System.out.println(reader.read());
        reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
