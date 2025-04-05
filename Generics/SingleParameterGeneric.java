class Name<N> {
    private N name;

    public void setName(N name){
        this.name = name;
    }

    public N getName(){
        return name;
    }
}

public class SingleParameterGeneric{
    public static void main(String[] args) {
        Name<String> newname = new Name<>();
        newname.setName("Hiyaa");
        System.out.println(newname.getName());
    }
}
