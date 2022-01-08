package solid.after3;


public class Sparrow extends Bird {
    FlyingBehaviour flyingBehaviour = new FastFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
