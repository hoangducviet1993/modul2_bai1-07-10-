package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    private Map<String, String> myDictionary;

    public Dictionary() {
        myDictionary = new HashMap<>();
        myDictionary.put("Red", "Màu Đỏ");
        myDictionary.put("Blue", "Xanh Dương");
        myDictionary.put("White", "Trắng");
        myDictionary.put("Green", "Xanh");
        myDictionary.put("Yellow", "Vàng");
        myDictionary.put("Pink", "Màu Hồng");
        myDictionary.put("Black", "Đen");
        myDictionary.put("Orange", "Màu Da Cam");
        myDictionary.put("Browm", "Màu Nâu");
        myDictionary.put("Purple", "Tím");

    }

    public void add(String key, String value) {
        myDictionary.put(key, value);
    }

    public String search(String key) {
        return myDictionary.get(key);
    }

    public void print() {
        Set<String> keys = myDictionary.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + myDictionary.get(key));
        }
        System.out.println("------------------");
    }

}