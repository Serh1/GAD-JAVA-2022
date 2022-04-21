package Lecture5.Ch2;

import java.util.Objects;

public class Pair<S extends Shoe> {
    private S first;
    private S second;

    public Pair(S firstShoe, S secondShoe) throws ColorsDoNotMatchException, SizesDoNotMatchException {
        if (!Objects.equals(firstShoe.getColor(), secondShoe.getColor())) {
            throw new ColorsDoNotMatchException("Color dose not match!");
        }
        if (firstShoe.getSize() != secondShoe.getSize()) {
            throw new SizesDoNotMatchException("Size does not match!");
        }
        first = firstShoe;
        second = secondShoe;
    }

    public S getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
