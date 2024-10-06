public class Main {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        RadixSort.radixSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}