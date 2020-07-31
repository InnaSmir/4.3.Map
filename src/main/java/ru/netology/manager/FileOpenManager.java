package ru.netology.manager;

import java.util.*;

public class FileOpenManager {
    private Map<String, String> map = new HashMap<>();

    public void registerNewApp(String key, String value){
        map.put(key.toLowerCase(), value);
    }

    public void deleteApp(String key){
        map.remove(key.toLowerCase());
    }

    public String getNameOfApp(String key){
        return map.get(key.toLowerCase());
    }

    public Set<String> findAllExtensions(){
        return map.keySet();
    }

    public List<String> findAllApps(){
        List<String> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparing(String::toLowerCase));
        return list;
    }
}
