package solid.after2;

public class Hen extends Bird {
    FlyingBehaviour flyingBehaviour = new SlowFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
