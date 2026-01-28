import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is to test SameFirstLast
 * @author Kecheng Hu(Caesar)
 * @since 01/27/2026
 * course CS5004 (Object-oriented programming)
 */


public class SameFirstLastTest {
    private SameFirstLast checker;

    @BeforeEach
    public void setUp() {
        checker = new SameFirstLast();
    }
    @Test
    public void testEmptyArray() {
        int[] input1= {};
        assertFalse(checker.sameFirstLast(input1),"Empty array should return false");

    }

    @Test
    public void testSingleElement() {
        int[] input2 = {1};
        assertTrue(checker.sameFirstLast(input2),"Single Element should return true");
    }

    @Test
    public void testMatchedArray() {
        int[] input3 = {1,2,3,4,5,1};
        assertTrue(checker.sameFirstLast(input3),"Should return true when the first and last elements are equal.");

    }

    @Test
    public void testDisMatchedArray() {
        int[] input4 = {1,2,3,4,5};
        assertFalse(checker.sameFirstLast(input4),"Should return false when the first and last elements are not equal.");
    }
}
