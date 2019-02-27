package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
      Integer[] answer = new Integer[stop - start + 1];
      int index = 0;
      for (int i = stop; i >= start; i--){
          answer[index] = i;
          index++;
      }
      return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]  + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0]  * array[1];
    }
}
