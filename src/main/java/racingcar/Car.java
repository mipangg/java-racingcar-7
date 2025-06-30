package racingcar;

import racingcar.util.RandomGenerator;

public class Car {
    final int MOVABLE = 4;

    RandomGenerator randomGenerator;

    String name;
    int move = 0;

    public Car(String name, RandomGenerator randomGenerator) {
        this.name = name;
        this.randomGenerator = randomGenerator;
    }

    public int getMove() {
        return move;
    }

    public String getName() {
        return name;
    }

    void move() {
        if (isMovable()) {
            move++;
        }
    }

    boolean isMovable() {
        return randomGenerator.genRandom() >= MOVABLE;
    }

    public static class View {

    }
}