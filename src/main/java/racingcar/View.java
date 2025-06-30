package racingcar;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class View {
    private final Scanner sc = new Scanner(System.in);

    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return sc.nextLine();
    }

    public int inputRaceTimes() throws IllegalArgumentException {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return sc.nextInt();
    }

    public void showResult(List<Map<String, Integer>> result) {
        System.out.println();
        System.out.println("실행 결과");

        for (Map<String, Integer> round : result) {
            printResult(round);
        }
    }

    private void printResult(Map<String, Integer> round) {
        for (String name : round.keySet()) {
            System.out.print( name + " : ");
            printScore(round.get(name));
        }
        System.out.println();
    }

    private void printScore(int score) {
        for (int i = 0; i < score; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void showWinners(List<Car> winners) {
        System.out.print("최종 우승자 : ");
        List<String> winnerNames = winners.stream().map(Car::getName).toList();
        System.out.println(String.join(", ", winnerNames));
    }
}
