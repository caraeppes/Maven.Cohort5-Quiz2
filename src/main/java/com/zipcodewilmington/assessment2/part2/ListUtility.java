package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;


public class ListUtility {

    private List<Integer> list = new ArrayList<>();


    public Boolean add(int i) {
            list.add(i);
            return this.contains(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : list){
            if (!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }

    public String join() {
        String s = "";
        for(int i = 0; i < list.size() - 1; i++){
            s = s + list.get(i) + ", ";
        }
        s = s + list.get(list.size() - 1);

        return s;
    }

    ArrayUtility arrayUtility = new ArrayUtility();

    public Integer mostCommon() {
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);
        return arrayUtility.mostCommon(array);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }

}
