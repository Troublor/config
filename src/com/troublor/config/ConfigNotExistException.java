package com.troublor.config;

public class ConfigNotExistException extends Exception {

    private Object key;

    /**
     * construction
     *
     * @param key the key that is input and does not exist in configuration
     */
    public ConfigNotExistException(Object key) {
        super(String.format(
                "Key %s does not exist in configuration", key.toString()
        ));
        this.key = key;
    }

    /**
     * getter of key
     *
     * @return key
     */
    public Object getKey() {
        return key;
    }
}
