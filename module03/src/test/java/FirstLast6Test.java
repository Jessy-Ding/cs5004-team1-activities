/**
 * This is the JUnit test for class FirstLast6.
 * @author Yanshi Liu
 * @since 2026-01-26
 * course CS5004 (Object-Oriented Programming)
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FirstLast6Test {

    @Test
    public void testLastIs6() {
        int[] nums = {1, 2, 6};
        assertTrue(FirstLast6.firstLast6(nums));
    }

    @Test
    public void testFirstIs6() {
        int[] nums = {6, 1, 2, 3};
        assertTrue(FirstLast6.firstLast6(nums));
    }

    @Test
    public void testNo6AtEnds() {
        int[] nums = {13, 6, 1, 2, 3};
        assertFalse(FirstLast6.firstLast6(nums));
    }

    @Test
    public void testSingleElement6() {
        int[] nums = {6};
        assertTrue(FirstLast6.firstLast6(nums));
    }

    @Test
    public void testSingleElementNot6() {
        int[] nums = {3};
        assertFalse(FirstLast6.firstLast6(nums));
    }
}
