package racingcar;

import static racingcar.Validator.*;

import java.util.ArrayList;
import java.util.List;
import racingcar.util.DefaultRandomGenerator;

public class Controller {

    public List<Car> getCarList(String input) {
        validateInput(input);

        String[] carNames = input.replaceAll(" ", "").split(",");

        return genCars(carNames);
    }

    private static List<Car> genCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            if (carName.isEmpty()) {
                continue;
            }
            validateCarName(carName);
            cars.add(new Car(carName, new DefaultRandomGenerator()));
        }

        return cars;
    }

}
