class Animal {
    void eat() {
        System.out.println("eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking....");
    }
}

public class TestInheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // calling the eat method from the Animal class
        dog.bark(); // calling the bark method from the Dog class
    }
}
