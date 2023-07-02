package org.example;

public class BubbleSort {
    public void sort(int[] array){

        boolean isSorted;

        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) return;
        }

    }
}
