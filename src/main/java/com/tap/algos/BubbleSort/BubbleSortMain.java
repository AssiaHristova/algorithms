package com.tap.algos.BubbleSort;

public class BubbleSortMain {
    public static int[] bubbleSort(int[] numbers){

        while (true) {
            int counter = 0;
            for (int i=0; i < numbers.length -1; ++i){
                int currNum = numbers[i];
                if (numbers[i] > numbers[i + 1]){
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = currNum;
                    counter += 1;
        }
            }
            if (counter == 0){
                return numbers;
            }
        }
    }
}





