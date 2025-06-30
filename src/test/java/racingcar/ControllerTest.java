package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.DefaultRandomGenerator;

class ControllerTest {

    Controller controller = new Controller();

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분한다.")
    void car_name_can_divide_for_comma() throws Exception {

        String input = "pobi,woni,jun";

        List<String> carNames = List.of("pobi", "woni", "jun");

        List<Car> actualCarList = controller.getCarList(input);

        for (int i = 0; i < actualCarList.size(); i++) {
            assertThat(actualCarList.get(i).getName()).isEqualTo(carNames.get(i));
        }
    }

}