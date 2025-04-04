import java.io.*;
public class FIS{
    public static void main(String[] args) {
        
        try {
            FileInputStream obj = new FileInputStream("eg.txt");
            int data;
            while ((data = obj.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
