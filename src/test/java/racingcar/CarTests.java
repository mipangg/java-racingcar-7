package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTests {

    @Test
    @DisplayName("각 자동차에 5자 이하의 이름을 부여할 수 있다.")
    void car_have_name_under_5() throws Exception {
        Car car = new Car("car1");

        assertEquals("car1", car.name);
    }

}