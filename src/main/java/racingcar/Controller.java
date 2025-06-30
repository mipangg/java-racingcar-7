package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.util.DefaultRandomGenerator;

public class Controller {

    public List<Car> getCarList(String input) {
        String[] carNames = input.split(",");

        return genCars(carNames);
    }

    private static List<Car> genCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName, new DefaultRandomGenerator()));
        }
        return cars;
    }


}
