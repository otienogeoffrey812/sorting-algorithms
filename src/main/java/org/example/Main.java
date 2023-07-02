package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1000, 12,4,23,673,45};
        var bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

    }
}