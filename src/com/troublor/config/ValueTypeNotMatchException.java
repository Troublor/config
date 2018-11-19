package com.troublor.config;

/**
 * Exception thrown when the type of default value is not the same as that of what is saved in configuration
 */
public class ValueTypeNotMatchException extends Exception {
    /**
     * The class that is input
     */
    private Class gotClass;

    /**
     * The class that should be input
     */
    private Class expectedClass;

    /**
     * Constructor
     *
     * @param gotClass the class that is input
     * @param expectedClass the class that should be input
     */
    public ValueTypeNotMatchException(Class gotClass, Class expectedClass) {
        super(
                String.format(
                        "Value type mismatch, expect %s but got %s",
                        gotClass.toString(), expectedClass.toString())
        );
        this.gotClass = gotClass;
        this.expectedClass = expectedClass;
    }

    /**
     * Constructor
     *
     * @param gotClass the class that is input
     */
    public ValueTypeNotMatchException(Class gotClass) {
        super(
                String.format(
                        "Value type mismatch, got %s expect unknown",
                        gotClass.toString())
        );
        this.gotClass = gotClass;
    }

    /**
     * Getter of gotClass
     *
     * @return gotClass
     */
    public Class getGotClass() {
        return gotClass;
    }

    /**
     * Getter of ExpectedClass
     *
     * @return expectedClass
     */
    public Class getExpectedClass() {
        return expectedClass;
    }
}
