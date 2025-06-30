package racingcar;

import static racingcar.Validator.*;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import racingcar.util.DefaultRandomGenerator;

public class Controller {

    private View view = new View();
    private Mapper mapper = new Mapper();
    private CarRace carRace;

    public void play() {
        String carNames = view.inputCarNames();
        List<Car> carList = mapper.toEntity(carNames);

        carRace = new CarRace(carList);

        int times = view.inputRaceTimes();
        List<Map<String, Integer>> result = carRace.run(times);
        view.showResult(result);

        List<Car> winners = carRace.getWinners();
        view.showWinners(winners);
    }

}
