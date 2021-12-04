package com.tap.algos.Quicksort;

public class QuicksortMain {
    private static int[] sorting(int[] numbers){
            int pivot;
            int pivotIndex;

            for (int i = 0; i < numbers.length; ++i) {
                pivot = numbers[i];
                pivotIndex = i;
                for (int j = 0; j < numbers.length; ++j) {
                    if (numbers[j] < pivot) {
                        if (j > pivotIndex) {
                            numbers[pivotIndex] = numbers[j];
                            numbers[j] = pivot;
                            pivotIndex = j;
                        }
                    }
                }
            }
            return numbers;
    }
    public static int[] quickSort(int[] numbers){
        sorting(numbers);
        sorting(numbers);
    return numbers;
}
    }

