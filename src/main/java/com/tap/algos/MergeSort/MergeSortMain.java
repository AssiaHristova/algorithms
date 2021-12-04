package com.tap.algos.MergeSort;

public class MergeSortMain {
    public static int[] mergeSort(int[] numbers) {
        int k = 0;
        int currNum = 0;


        for (int i = 0; i < numbers.length - 1; i+=2){
            if (numbers[i + 1] < numbers[i]){
                currNum = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = currNum;
            }
        }
        k += 2;
        for (int i = 0; i < numbers.length - 1 -k; i+=2 + k){
            for (k = 2; k < 4; ++k){
                if (numbers[k] < numbers[i]){
                    currNum = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[i + 1] = currNum;
                }
            }
        }



        return numbers;
    }
}
