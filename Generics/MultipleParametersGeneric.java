class Info<N,P>{
    private N name;
    private P password;

    public Info(N name, P password){
        this.name = name;
        this.password = password;
    }

    public N getName(){
        return name;
    }

    public P getPassword(){
        return password;
    }
}

public class MultipleParametersGeneric{
    public static void main(String[] args) {
        Info<String, Integer> student = new Info<>("Hiyaa", 123456);
        System.out.println("Name: " + student.getName() + " Password: " + student.getPassword());
    }
}
