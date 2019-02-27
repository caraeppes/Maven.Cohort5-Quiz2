package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {

    Map<String, String> map = new TreeMap<>();

    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {

        return map.keySet().size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        add(path, studentController);
    }

    public void remove(String path) {
        map.put(path, null);
    }

    public String toString(){
        String s = "";

        for(String path : map.keySet()){
            s = s + path + " -> " + map.get(path) + "\n";
        }
        return s;
    }
}
