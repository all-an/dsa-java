
## Visualizing Merge Sort

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/mergesort.png" />
        </a>
</p>

## Splitting phase

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/visualizing-mergesort1.png" />
        </a>
</p>

## Merging phase

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/visualizing-mergesort2.png" />
        </a>
</p>

## Visualizing:

```java
// { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        . . .
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part1.png" />
        </a>
</p>
