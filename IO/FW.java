import java.io.*;

public class FW{
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("eg.txt");
            String data = "Hi , testing FileWriter";
            obj.write(data);
            System.out.println("Written Successfully");
            obj.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
