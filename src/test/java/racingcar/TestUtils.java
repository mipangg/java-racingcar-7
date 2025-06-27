package racingcar;

import java.util.List;

public class TestUtils {

    public static List<Car> genCarList() {
        Car car1 = new Car("car1", () -> 5);
        Car car2 = new Car("car2", () -> 1);
        Car car3 = new Car("car1", () -> 5);

        return List.of(car1, car2, car3);
    }

}
