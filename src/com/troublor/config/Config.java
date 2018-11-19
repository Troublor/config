package com.troublor.config;

import java.util.Hashtable;
import java.util.Map;

public class Config {
    private static Map<Object, Object> configTable = new Hashtable<>();

    /**
     * add configuration to config table
     * config form is key-value
     *
     * @param key key of one configuration
     * @param value value of the configuration
     * @param <K> Class type of key
     * @param <V> Class type of value
     * @return boolean whether the key exists which means whether the addition is a success
     */
    public <K, V> boolean add(K key, V value) {
        if (Config.configTable.containsKey(key)) {
            return false;
        }
        Config.configTable.put(key, value);
        return true;
    }

    public <K, V> V get(K key) {

    }
}
