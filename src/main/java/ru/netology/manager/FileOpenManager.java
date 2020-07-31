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

    public Set<String> findAllApps() {
        return new HashSet<>(map.values());
    }

}
