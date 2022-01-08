package solid.after3.hen;

import solid.after3.Bird;
import solid.after3.FlyingBehaviour;
import solid.after3.SlowFlyingBehaviour;

public class Hen extends Bird {
    FlyingBehaviour flyingBehaviour = new SlowFlyingBehaviour();

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
