package org.example;

public class SortingAlgorithms {
    public void bubbleSort(int[] array){

        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            // Inner loop goes only up to the unsorted portion of the array -- last items are sorted
            for (int j = 0; j < array.length - 1 - i; j++) {
//            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) return;
        }
    }
    public void selectionSort(int[] array){
        //Find the smallest element in the unsorted part of the array.
        //Swap it with the first element of the unsorted part (which becomes the last element of the sorted part).
        //Repeat the process until the whole array is sorted.
        // Time Complexity - n (passes) * n (comparisons) = n^2
        // Best - n^2 , Average - n^2, Worst - n^2
        // Space complexity - 0(1) - In-place sorting, no additional space needed

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {

                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
