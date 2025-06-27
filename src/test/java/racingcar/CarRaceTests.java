package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.DefaultRandomGenerator;

class CarRaceTests {

    CarRace carRace = new CarRace();

    @Test
    @DisplayName("주어진 횟수 동안 n대의 자동차는 경주한다. ")
    void cars_run_for_given_times() throws Exception {

        Car car1 = new Car("car1", () -> 5);
        Car car2 = new Car("car2", () -> 1);
        List<Car> cars = List.of(car1, car2);

        carRace.race(cars, 3);

        assertThat(car1.getMove()).isEqualTo(3);
        assertThat(car2.getMove()).isEqualTo(0);

    }
    
}