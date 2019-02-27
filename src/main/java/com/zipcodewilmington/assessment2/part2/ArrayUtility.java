package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] answer = new Integer[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            answer[i] = array1[i];
        }

        for(int i = 0; i < array2.length; i++){
            answer[i + array1.length] = array2[i];
        }
        return answer;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] answer = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            if(i - index < 0){
                answer[array.length - index + i] = array[i];
            }
            else {
                answer[i - index] = array[i];
            }
        }
        return answer;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for(Integer i : array1){
            if(i == valueToEvaluate){
                counter++;
            }
        }
        for(Integer i : array2){
            if(i == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
    return 0;
    }
}
