package racingcar;

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

    public Car getWinner() {
        Car winner = null;
        for (Car car : cars) {
            if (winner == null) {
                winner = car;
                continue;
            }
            if (car.getMove() > winner.getMove()) {
                winner = car;
            }
        }
        return winner;
    }

}
