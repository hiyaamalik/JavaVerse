import java.util.*;

class Animals {
    public void voice() {
        System.out.println("Animal's Sound");
    }
}

class Dog extends Animals {
    public void voice() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals {
    public void voice() {
        System.out.println("Cat Meows");
    }
}

class Lion extends Animals {
    public void voice() {
        System.out.println("Lion Roars");
    }
}

public class AnimalsHeirarchialInheritance {
    public static void main(String[] args) {
        Dog pluto = new Dog();
        pluto.voice();  
        System.out.println("Pluto is a dog.");
    }
}

