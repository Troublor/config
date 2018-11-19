package com.troublor.config;

import java.util.Hashtable;
import java.util.Map;

/**
 * Configuration class that contains many key-value configurations
 *
 * @param <K> type of key
 * @param <V> type of value
 */
public class Config<K, V> {
    protected Map<K, V> configTable = new Hashtable<>();

    /**
     * Add configuration to config table
     * config form is key-value
     *
     * @param key   key of one configuration
     * @param value value of the configuration
     * @return boolean whether the key exists which means whether the addition is a success
     */
    public boolean add(K key, V value) {
        if (configTable.containsKey(key)) {
            return false;
        }
        configTable.put(key, value);
        return true;
    }

    /**
     * Get configuration
     *
     * @param key the key of one configuration
     * @return the value of one configuration
     * @throws ConfigNotExistException thrown when the key is not found in all configurations
     */
    public V get(K key) throws ConfigNotExistException {
        if (!configTable.containsKey(key)) {
            throw new ConfigNotExistException(key);
        }
        return configTable.get(key);
    }
}
