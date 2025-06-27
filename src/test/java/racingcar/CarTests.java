package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.DefaultRandomGenerator;

class CarTests {

    @Test
    @DisplayName("각 자동차에 5자 이하의 이름을 부여할 수 있다.")
    void car_have_name_under_5() throws Exception {
        Car car = new Car("car1", new DefaultRandomGenerator());

        assertEquals("car1", car.name);
    }

    @Test
    @DisplayName("0에서 9 사이의 무작위 값이 4 이상일 경우 전진할 수 있다.")
    void car_can_move() throws Exception {
        Car car = new Car("car1", () -> 4);

        int expectedPosition = car.getMove() + 1;

        car.move();
        int actualPosition = car.getMove();

        assertEquals(actualPosition, expectedPosition);
    }

    @Test
    @DisplayName("0에서 9 사이의 무작위 값이 4 미만일 경우 전진할 수 없다.")
    void car_can_not_move() throws Exception {
        Car car = new Car("car1", () -> 1);

        int expectedPosition = car.getMove();

        car.move();
        int actualPosition = car.getMove();

        assertEquals(actualPosition, expectedPosition);
    }

}