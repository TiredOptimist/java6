package ru.pankova.ToString;

@ToString(value = "YES")
public class ToStringClass {
    @ToString(value = "NO")
    private String exampleField;

    public ToStringClass() {
    }

    public ToStringClass(String exampleField) {
        this.exampleField = exampleField;
    }

    public String getExampleField() {
        return exampleField;
    }

    public String toString() {
        return "Аннотация с ToString: " + exampleField;
    }
}