package solid.after2;


public class Crow extends Bird {
    String soundHarsheness;
    int stones;
    FlyingBehaviour flyingBehaviour = new CrowFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
