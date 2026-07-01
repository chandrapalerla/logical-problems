package com.interview.snp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    Map<String,String> dictionary = new HashMap<>();
    
    public synchronized void addToDictionary(String key, String value){
        if(dictionary.containsKey(key)){
            throw new IllegalArgumentException("Already present");
        }
        dictionary.put(key,value);
    }

    public synchronized String getWord(String key){
        if(!dictionary.containsKey(key)){
            throw new IllegalArgumentException("Not present");
        }
        return dictionary.get(key);
    }

    public synchronized Set<String> getAllWords(){
        return dictionary.keySet();
    }
}