public class Client {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.name = "Vikram";
        a2.name = "Naman";
        a1.colour = "Yellow";
        a2.colour = "White";

        a1.makeSound();
        a2.makeSound();

        GermanShephard g1 = new GermanShephard();
        g1.name = "something";
        g1.makeSound();

        g1.tailLength = 4;
    }
}
