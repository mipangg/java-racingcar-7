package racingcar;

import java.util.List;

public class CarRace {

    void race(List<Car> cars, int times) {
        for (int i = 0; i < times; i++) {
            for (Car car : cars) {
                car.move();
            }
        }
    }

}
