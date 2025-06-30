package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.security.Provider.Service;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ServiceTests {

    Mapper mapper = new Mapper();

    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분한다.")
    void car_name_can_divide_for_comma() throws Exception {

        String input = "pobi,woni,jun";
        List<String> carNames = List.of("pobi", "woni", "jun");

        List<Car> actualCarList = mapper.toEntity(input);

        for (int i = 0; i < actualCarList.size(); i++) {
            assertThat(actualCarList.get(i).getName()).isEqualTo(carNames.get(i));
        }
    }

    @Test
    @DisplayName("자동차 이름 입력 시 쉼표 사이의 공백은 없는 이름으로 취급한다.")
    void blank_is_null() throws Exception {

        String input = "pobi,,jun";
        List<String> carNames = List.of("pobi", "jun");

        List<Car> actualCarList = mapper.toEntity(input);

        for (int i = 0; i < actualCarList.size(); i++) {
            assertThat(actualCarList.get(i).getName()).isEqualTo(carNames.get(i));
        }

    }
}