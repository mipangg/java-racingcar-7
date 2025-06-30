package racingcar;

import racingcar.util.RandomGenerator;

public class Car {
    private final int MOVABLE = 4;

    private final RandomGenerator randomGenerator;

    private String name;
    private int move = 0;

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

    public int move() {
        if (isMovable()) {
            move++;
        }
        return move;
    }

    boolean isMovable() {
        return randomGenerator.genRandom() >= MOVABLE;
    }

}