import org.example.CountingSortBaeldung;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class CountingSortBaeldungTest {

    @Test
    public void countElements_GivenAnArray_ShouldCalculateTheFrequencyArrayAsExpected() {
        int k = 5;
        int[] input = { 4, 3, 2, 5, 4, 3, 5, 1, 0, 2, 5 };

        int[] c = CountingSortBaeldung.countElements(input, k);
        int[] expected = { 1, 2, 4, 6, 8, 11 };
        assertArrayEquals(expected, c);
    }

    @Test
    public void sort_GivenAnArray_ShouldSortTheInputAsExpected() {
        int k = 5;
        int[] input = { 4, 3, 2, 5, 4, 3, 5, 1, 0, 2, 5 };

        int[] sorted = CountingSortBaeldung.sort(input, k);

        // Our sorting algorithm and Java's should return the same result
        Arrays.sort(input);
        assertArrayEquals(input, sorted);
    }

}
