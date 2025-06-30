package racingcar;


import java.util.List;

public class Validator {

    public static void validateInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해 주세요.");
        }
    }

    public static void validateCarName(String input) {
        if (input.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

}