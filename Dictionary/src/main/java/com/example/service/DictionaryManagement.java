package com.example.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryManagement {
    private Map<String,String> dictionary;
    private static DictionaryManagement dictionaryManagement = new DictionaryManagement();
    public DictionaryManagement(){
        this.dictionary = new HashMap<>();
        dictionary.put("table","bàn");
        dictionary.put("air","không khí");
        dictionary.put("plane","máy bay");
        dictionary.put("boat","thuyền");
    }
    public static DictionaryManagement getDictionaryManagement(){
        return dictionaryManagement;
    }

    public String get(String key) {
        return dictionaryManagement.get(key);
    }
}
