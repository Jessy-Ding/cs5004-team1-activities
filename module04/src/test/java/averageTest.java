import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit tests for class average.
 *
 * @author Yikang Liu
 * @since 2026-02-03
 * Course: CS5004 (Object-Oriented Programming)
 */
public class averageTest {

    private static final double DELTA = 1e-9;
    private average avg;

    @Before
    public void setUp() {
        avg = new average();
    }

    @Test
    public void testAverageIntegers() {
        assertEquals(20.0, avg.average(10.0, 20.0, 30.0), DELTA);
    }

    @Test
    public void testAverageDecimals() {
        assertEquals(4.5, avg.average(3.75, 4.5, 5.25), DELTA);
    }

    @Test
    public void testAverageMixedSigns() {
        assertEquals(5.0 / 3.0, avg.average(10.0, -10.0, 5.0), DELTA);
    }
}
