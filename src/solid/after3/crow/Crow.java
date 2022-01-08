package solid.after3.crow;


import solid.after3.*;

public class Crow extends Bird implements Flyable, Runner {
    String soundHarsheness;
    int stones;
    FlyingBehaviour flyingBehaviour = new CrowFlyingBehaviour();
    RunningBehaviour runningBehaviour = new CrowRunningBehaviour();

    @Override
    public void fly() {
        flyingBehaviour.fly();
    }

    @Override
    public void run() {
        runningBehaviour.run();
    }

    //    @Override
//    void fly() {
//        flyingBehaviour.fly();
//    }
}
