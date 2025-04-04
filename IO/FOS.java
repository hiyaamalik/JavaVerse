import java.io.*;

public class FOS{
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream("eg.txt");
            String data = "File Output Stream writing this!";
            obj.write(data.getBytes());
            System.out.println("File Written");
            obj.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
