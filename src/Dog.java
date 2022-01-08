public class Dog extends Animal {
    int tailLength;

    @Override
    void makeSound() {
        System.out.println("Dogggggg is also making sound");
    }

    void makeSound(String name) {
        System.out.println("Overloaded method make name");
    }
}
