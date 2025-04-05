class Info{

    public <N, P> void displayInfo(N name, P password){
         System.out.println("Name: " + name + " Password: " + password);
    }
}

public class GenericMethod{
    public static void main(String[] args) {
        Info student = new Info();
        student.<String, Integer>displayInfo("Hiyaa", 12345);
        }
}
