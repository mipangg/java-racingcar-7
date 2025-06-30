package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.Validator.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTests {

    @Test
    @DisplayName("자동차 이름이 비어있으면 예외가 발생한다.")
    void car_name_should_not_be_null() throws Exception {

        assertThatThrownBy(
                () -> {
                    validateInput("");
                }
        ).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("자동차 이름이 6자 이상이면 예외가 발생한다.")
    void car_name_should_be_under_6() throws Exception {

        assertThatThrownBy(
                () -> {
                    validateCarName("pobiii");
                }
        ).isInstanceOf(IllegalArgumentException.class);

    }
}