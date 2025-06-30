package racingcar.util;

public class DefaultRandomGenerator implements RandomGenerator {
    @Override
    public int genRandom() {
        return (int) (Math.random() * 10);
    }
}
