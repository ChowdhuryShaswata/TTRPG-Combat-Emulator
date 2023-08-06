package domain;

import java.util.Random;

/**
 * Represents a die with a specific size that can be rolled to get a random value between 1 and the size.
 */
public class Die {
    private int size;

    /**
     * Creates a new die with the specified size.
     *
     * @param size The number of sides on the die.
     * @throws IllegalArgumentException If the size is not greater than 0.
     */
    public Die(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Die size must be greater than 0.");
        }
        this.size = size;
    }

    /**
     * Gets the size of the die.
     *
     * @return The number of sides on the die.
     */
    public int getSize() {
        return size;
    }

    /**
     * Rolls the die and returns a random value between 1 and the size (inclusive).
     *
     * @return The rolled value.
     */
    public int roll() {
        Random random = new Random();
        return random.nextInt(size) + 1;
    }
}

