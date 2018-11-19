package com.troublor.config;

/**
 * Exception thrown when the type of default value is not the same as that of what is saved in configuration
 */
public class ValueTypeNotMatchException extends Exception {
    private Class gotClass;
    private Class expectedClass;

    public ValueTypeNotMatchException(Class gotClass, Class expectedClass) {
        super(
                String.format(
                        "Default value type mismatch, expect %s but got %s",
                        gotClass.toString(), expectedClass.toString())
        );
        this.gotClass = gotClass;
        this.expectedClass = expectedClass;
    }

    public Class getGotClass() {
        return gotClass;
    }

    public Class getExpectedClass() {
        return expectedClass;
    }
}
