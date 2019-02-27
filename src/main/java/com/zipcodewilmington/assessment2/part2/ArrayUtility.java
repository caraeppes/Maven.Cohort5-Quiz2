package com.zipcodewilmington.assessment2.part2;

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
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
