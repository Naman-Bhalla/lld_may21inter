package solid.before;

public class Bird {
    String gender;
    String type;
    String color;

    void fly() {
        if (type.equals("Pigeon")) {
            System.out.println("Pigeon flies");
        } else if (type.equals("Parrot")) {
            System.out.println("Parrot fly");
        } else if (type.equals("Crow")) {
            System.out.println("Crow flies");
        }
    }
}
