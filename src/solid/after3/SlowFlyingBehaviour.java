package solid.after3;

public class SlowFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying slow");
    }
}
