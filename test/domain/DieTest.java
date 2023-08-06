package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DieTest {

    @Test
    public void testDieCreation() {
        // Test positive size
        Die die = new Die(6);
        Assertions.assertEquals(6, die.getSize());

        // Test size with value 1
        die = new Die(1);
        Assertions.assertEquals(1, die.getSize());

        // Test size with large value
        die = new Die(1000);
        Assertions.assertEquals(1000, die.getSize());
    }

    @Test
    public void testInvalidDieCreation() {
        // Test non-positive size
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Die(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Die(-10));
    }

    @Test
    public void testDieRoll() {
        Die die = new Die(6);

        // Roll multiple times to ensure values are within range
        for (int i = 0; i < 1000; i++) {
            int rollResult = die.roll();
            Assertions.assertTrue(rollResult >= 1 && rollResult <= 6);
        }
    }
}
