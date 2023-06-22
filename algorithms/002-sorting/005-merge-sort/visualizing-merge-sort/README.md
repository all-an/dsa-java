
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

## Visualizing Splitting phase:

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

```java
mergeSort(input, start, mid);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part2.png" />
        </a>
</p>


```java
// ending left from first part left , returning
mergeSort(input, start, mid);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part3.png" />
        </a>
</p>

```java
mergeSort(input, mid, end);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part4.png" />
        </a>
</p>

```java
// returning all recursions to the beginning we'll now split the right part of the main array
// dive in the recursion again, the beginning for the right part now
mergeSort(input, start, mid);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part5.png" />
        </a>
</p>

```java
// dive in the recursion again, the beginning for the left part from the main right part now
mergeSort(input, start, mid);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part6.png" />
        </a>
</p>

```java
// finish splitting the left part from the main right part now
// now the right part from the main right part
mergeSort(input, mid, end);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part7.png" />
        </a>
</p>

```java
// finish splitting
mergeSort(input, mid, end);
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part8.png" />
        </a>
</p>

```java
// completed the splitting phase
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part9.png" />
        </a>
</p>

## Tree of recursive mergeSort method calls

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part10.png" />
        </a>
</p>

## Visualizing Merging phase:

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part11.png" />
        </a>
</p>


<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/algorithms/002-sorting/005-merge-sort/visualizing-merge-sort/mergesort-part12.png" />
        </a>
</p>