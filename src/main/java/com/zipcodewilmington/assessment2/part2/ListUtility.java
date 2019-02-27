package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    private List<Integer> list = new ArrayList<>();


    public Boolean add(Integer i) {
        if(i != null) {
            list.add(i);
            return this.contains(i);
        }
        return null;

    }

    public Integer size() {
        return null;
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        if (valueToAdd != null) {
            return list.contains(valueToAdd);
        }
        return true;
    }
}
