package racingcar;

import static racingcar.Validator.validateCarName;
import static racingcar.Validator.validateInput;

import java.util.ArrayList;
import java.util.List;
import racingcar.util.DefaultRandomGenerator;

public class Mapper {

    public List<Car> toEntity(String input) {
        validateInput(input);

        String[] carNames = input.replaceAll(" ", "").split(",");

        return genCars(carNames);
    }

    private List<Car> genCars(String[] carNames) {
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
