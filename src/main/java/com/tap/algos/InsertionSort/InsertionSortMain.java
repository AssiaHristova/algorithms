
package com.tap.algos.InsertionSort;

public class InsertionSortMain {
    public static int[] insertionSort(int[] numbers){
        int currNum;

        for (int i=1; i < numbers.length; ++i){
            for (int j= i - 1; j >= 0; --j){
                currNum = numbers[j];
                if (numbers[j + 1] < numbers[j]) {
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = currNum;
                    }
                }
                }
        return numbers;
            }
        }

