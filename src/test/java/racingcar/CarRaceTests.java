package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static racingcar.TestUtils.genCarList;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.DefaultRandomGenerator;

class CarRaceTests {

    List<Car> cars = genCarList();
    CarRace carRace = new CarRace(cars);

    @Test
    @DisplayName("주어진 횟수 동안 n대의 자동차는 경주한다. ")
    void cars_run_for_given_times() throws Exception {

        carRace.race( 3);
        assertThat(cars.get(0).getMove()).isEqualTo(3);
        assertThat(cars.get(1).getMove()).isEqualTo(0);

    }

    @Test
    @DisplayName("자동차 경주 게임을 완료한 후 우승자를 선별할 수 있다. ")
    void winner_exist_after_game() throws Exception {

        Car expectedWinner = cars.getFirst();

        carRace.race(3);

        assertThat(carRace.getWinners().contains(expectedWinner)).isTrue();
    }

    @Test
    @DisplayName("우승자는 한 명 이상일 수 있다.")
    void winner_can_be_multiple() throws Exception {

        Car expectedWinner1 = cars.get(0);
        Car expectedWinner2 = cars.get(2);
        Car expectedLooser = cars.get(1);

        carRace.race(3);
        assertThat(carRace.getWinners().contains(expectedWinner1)).isTrue();
        assertThat(carRace.getWinners().contains(expectedWinner2)).isTrue();
        assertThat(carRace.getWinners().contains(expectedLooser)).isFalse();

    }
    
}