package solid.after3;

public class Pigeon extends Bird {
    FlyingBehaviour flyingBehaviour = new SlowFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
