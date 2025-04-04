import java.io.*;

public class FR{
    public static void main(String[] args) {
        try {
            FileReader obj = new FileReader("eg.txt");
            int data;
            while ((data = obj.read()) != -1){
                System.out.print((char)data);
            }
            obj.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
