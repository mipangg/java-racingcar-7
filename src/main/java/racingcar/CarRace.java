package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarRace {

    List<Car> cars;

    public CarRace(List<Car> cars) {
        this.cars = cars;
    }

    public void race(int times) {
        for (int i = 0; i < times; i++) {
            for (Car car : cars) {
                car.move();
            }
        }
    }

    public List<Car> getWinners() {
        int maxMove = 0;
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getMove() < maxMove) {
                continue;
            }
            if (car.getMove() > maxMove) {
                winners.clear();
            }
            winners.add(car);
            maxMove = car.getMove();
        }
        return winners;
    }

}
