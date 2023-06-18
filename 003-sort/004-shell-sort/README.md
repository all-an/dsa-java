
<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/shell-sort.png" />
        </a>
</p>

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/shell-sort2.png" />
        </a>
</p>

## Visualizing Shell Sort

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort1.png" />
        </a>
</p>

### for (int gap = intArray.length / 2; gap > 0; gap /= 2)

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort2.png" />
        </a>
</p>

```java
for (int i = gap; i < intArray.length; i++) {
    int newElement = intArray[i];

    int j = i;

    while (j >= gap && intArray[j - gap] > newElement) {
        intArray[j] = intArray[j - gap];
        j -= gap;
    }
```

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort3.png" />
        </a>
</p>

### intArray[j] = newElement;

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort4.png" />
        </a>
</p>

### after i++

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort5.png" />
        </a>
</p>

### 55 > 35 so everything remains as it is

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort6.png" />
        </a>
</p>

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort7.png" />
        </a>
</p>

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort8.png" />
        </a>
</p>

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort9.png" />
        </a>
</p>

### 20 is greater than -22 , subtract the gap
<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort10.png" />
        </a>
</p>


### -22 is less than 7 so intArray[j] = intArray[j - gap] , subtract gap
<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort11.png" />
        </a>
</p>

### intArray[j] = newElement;
<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort12.png" />
        </a>
</p>

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort13.png" />
        </a>
</p>


<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="804" height="444"  src="/002-sort/004-shell-sort/visualizing-shell-sort14.png" />
        </a>
</p>



 - [Image credits: learnprogramming.academy](https://learnprogramming.academy/)