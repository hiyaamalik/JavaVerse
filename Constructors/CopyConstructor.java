import java.util.*;

class CopyC {
    String name;

    CopyC(String name) {
        this.name = name;
        System.out.println("Hi " + name);
        System.out.println("This will be executed when the class is called with a parameter.");
    }

    CopyC(CopyC obj) {
        this.name = obj.name; 
        System.out.println("Copying from parameterized constructor");
        System.out.println("Bye " + name);
    }

    void display() {
        System.out.println("You need to call this method!");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        CopyC obj1 = new CopyC("Hiyaa"); 
        obj1.display();

        CopyC obj2 = new CopyC(obj1); 
        obj2.display();
    }
}
