package com.tap.algos.SelectionSort;

public class SelectionSortMain {
    public static int[] selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; ++i) {
            int currNum = numbers[i];
            int minNum = numbers[i];
            int minIndex = i;
            for (int j = i; j < numbers.length - 1; ++j) {
                if (numbers[j + 1] < numbers[j]) {
                    if (numbers[j + 1] < minNum) {
                        minNum = numbers[j + 1];
                        minIndex = j + 1;
                    }
                }
            }
            numbers[i] = minNum;
            numbers[minIndex] = currNum;
            }

        return numbers;
    }
    }
