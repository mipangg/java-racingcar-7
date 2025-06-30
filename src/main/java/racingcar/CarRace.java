package racingcar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRace {

    private final List<Car> cars;

    public CarRace(List<Car> cars) {
        this.cars = cars;
    }

    public List<Map<String, Integer>> run(int times) {
        List<Map<String, Integer>> results = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            results.add(getRaceResult());
        }
        return results;
    }

    private Map<String, Integer> getRaceResult() {
        Map<String, Integer> result = new HashMap<>();

        for (Car car : cars) {
            result.put(car.getName(), car.move());
        }

        return result;
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
