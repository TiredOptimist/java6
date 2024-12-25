package ru.pankova.Default;

@Default(value = DefaultClass.class)
public class DefaultClass {
    private String defaultField;

    public DefaultClass() {
        this.defaultField = "default";
    }

    public String getDefaultField() {
        return defaultField;
    }
}
