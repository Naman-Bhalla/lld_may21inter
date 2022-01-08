package solid.after2;

public class Pigeon extends Bird {
    FlyingBehaviour flyingBehaviour = new SlowFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
