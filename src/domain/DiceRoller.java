package domain;

/**
 * The DiceRoller class is responsible for rolling a given die multiple times and returning the sum
 * along with a constant value. This class is part of the core business functionality for handling dice rolls.
 */
public class DiceRoller {
    /**
     * Rolls the specified die a given number of times and returns the sum of the rolled values
     * added to a constant value.
     *
     * @param die      The die to roll.
     * @param times    The number of times to roll the die.
     * @param constant The constant value to add to the sum of the rolled values.
     * @return The sum of the rolled values added to the constant.
     * @throws IllegalArgumentException If the number of rolls is not greater than 0.
     */
    public int rollDice(Die die, int times, int constant) {
        if (times <= 0) {
            throw new IllegalArgumentException("Number of rolls must be greater than 0.");
        }

        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum += die.roll();
        }
        return sum + constant;
    }

    /**
     * Rolls the specified die a given number of times and returns the sum of the rolled values.
     * The default constant value is 0.
     *
     * @param die   The die to roll.
     * @param times The number of times to roll the die.
     * @return The sum of the rolled values.
     * @throws IllegalArgumentException If the number of rolls is not greater than 0.
     */
    public int rollDice(Die die, int times) {
        return rollDice(die, times, 0);
    }
}

