import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadixSortTest {

    @Test
    void testRadixSort() {
        // Test case: random numbers
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};

        // Call radixSort method
        RadixSort.radixSort(arr);

        // Verify the array is sorted
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        RadixSort.radixSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};

        RadixSort.radixSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-9, -2, -100, -50};
        int[] expected = {-100, -50, -9, -2};

        RadixSort.radixSort(arr);

        assertArrayEquals(expected, arr);
    }

}
