public class Animal implements Runner, Drinker {
    private String name;
    private int weight;
    private String colour;
    private String habitat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        System.out.println();
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getHabitat() {
        return habitat;
    }

    public void eat() {}

    void makeSound() {
        System.out.println("My name is " + name);
    }

    public void drink() {}

    public void run() {}
}

// Never expose data members
// getX() , setX

// Student joinClass()
// Instructor joinClass()
// Student {
//   BatchName: batch
//   changeBatch()
// }
// Design BMS
//
