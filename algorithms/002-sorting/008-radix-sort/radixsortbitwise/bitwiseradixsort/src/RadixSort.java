public class RadixSort {

    // Method to perform Radix Sort using bitwise operations
    public static void radixSort(int[] arr) {
        // Get the maximum number of bits needed to represent the largest number
        int maxBit = Integer.SIZE; // 32 bits for an int

        // Create a temporary array for sorting
        int[] temp = new int[arr.length];

        // Perform sorting for each bit position (0 to 31)
        for (int bit = 0; bit < maxBit; bit++) {
            // Step 1: Count how many numbers have the current bit set
            int count = 0;
            for (int num : arr) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            // Step 2: Rearrange based on the current bit
            int zeroIndex = 0; // To hold the index for numbers with 0 in the current bit
            int oneIndex = arr.length - count; // To hold the index for numbers with 1 in the current bit

            for (int num : arr) {
                if (((num >> bit) & 1) == 1) {
                    temp[oneIndex++] = num; // Place numbers with 1 in the current bit to the right
                } else {
                    temp[zeroIndex++] = num; // Place numbers with 0 in the current bit to the left
                }
            }

            // Step 3: Copy the sorted temp array back to the original array
            System.arraycopy(temp, 0, arr, 0, arr.length);
        }
    }

}
