package com.troublor.config;

/**
 * General configuration class, with object key and object value
 * When used, value can be cast to what is needed
 */
public class GeneralConfig extends Config<Object, Object> {
    /**
     * Singleton instance
     */
    private static GeneralConfig instance = new GeneralConfig();

    /**
     * Get singleton instance
     *
     * @return singleton instance
     */
    public static GeneralConfig getInstance() {
        return instance;
    }

    /**
     * Make GeneralConfig can not be initialized, for singleton usage
     */
    private GeneralConfig(){
        super();
    }

    /**
     * Get one configuration with key and specified value type
     *
     * @param key the key of one configuration
     * @param typeOfValue the class type of value
     * @param <K> the type of key
     * @param <V> the type of value
     * @return value that has been cast to typeOfValue
     * @throws ConfigNotExistException thrown when the key does not exist in configuration
     * @throws ValueTypeNotMatchException thrown when typeOfValue does not match the type of value
     */
    public <K, V> V get(K key, Class<V> typeOfValue) throws ConfigNotExistException, ValueTypeNotMatchException {
        Object tempValue;
        tempValue = super.get(key);
        if (typeOfValue.isInstance(tempValue)) {
            return (V) tempValue;
        } else {
            throw new ValueTypeNotMatchException(typeOfValue);
        }
    }

    /**
     * Get one configuration with key
     * if it does not exist, return default value provided in parameters
     *
     * @param key the key of one configuration
     * @param defaultValue default value returned when the key does not exist
     * @param <K> the type of key
     * @param <V> the type of value
     * @return When the key exist, return the value and cast it to the type of default value. When the key does not
     * exist, return defaultValue
     */
    public <K, V> V get(K key, V defaultValue) {
        Object tempValue;
        try {
            tempValue = super.get(key);
        } catch (ConfigNotExistException e) {
            return defaultValue;
        }
        // TODO unable to check whether the type cast is successful
        return (V) tempValue;
    }
}
