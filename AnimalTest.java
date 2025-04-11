// Interface Animal
interface Animal {
    void bark(); // method with no arguments and returns void
}

// Dog class that implements Animal
class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to test
public class AnimalTest {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark(); // Calling the bark method
    }
}
