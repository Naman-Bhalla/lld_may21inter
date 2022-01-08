package solid.after2;


public class Sparrow extends Bird {
    FlyingBehaviour flyingBehaviour = new FastFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
