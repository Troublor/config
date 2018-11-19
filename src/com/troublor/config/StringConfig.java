package com.troublor.config;

/**
 * Configuration class with String key and String value
 */
public class StringConfig extends Config<String, String> {
    /**
     * Get configuration with default value
     * if the key does not exist, then return default value provided in parameters
     *
     * @param key the key of one configuration
     * @param defaultValue the default value returned when the key does not exist
     * @return value of one configuration
     */
    public String get(String key, String defaultValue) {
        try {
            return super.get(key);
        } catch (ConfigNotExistException e) {
            return defaultValue;
        }
    }
}
