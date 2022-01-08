import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.setName("Vikram");
        a2.setName("Naman");
        a1.setColour("Yellow");
        a2.setColour("White");

        a1.makeSound();
        a2.makeSound();

        GermanShephard g1 = new GermanShephard();
        g1.setName("something");
        g1.makeSound();

        Animal a3 = new Dog();
        Dog d4 = new GermanShephard();

        g1.tailLength = 4;

        Cat cc1 = new Cat();
        cc1.setName("Cat 1");
        Dog dd1 = new Dog();
        dd1.setName("Dog 1");
        GermanShephard gg1 = new GermanShephard();
        gg1.setName("GS1");
        Labrador ll1 = new Labrador();
        ll1.setName("LL1");

        List<Animal> animals = List.of(cc1, dd1, gg1, ll1);

        for (var a : animals) {
            a.makeSound();
        }

        ll1.makeSound("Naman");

        Runner a = new Animal();
        a.run();

//        Database d1 = new MySQLDatabase();

        MySQLDatabase myMySQLDatabase = new MyMySQLDatabase();
    }
}

// GS has makeSound()
// GS->parent = Dog: Dog.makeSound()
// Dog->parent = Anima: Animal.makeSound()


// class ATM {
//   List<Branch> branches;
// }
//
// class Branch extends ATM {
//
// }

// SOLID I: Interface Segregation