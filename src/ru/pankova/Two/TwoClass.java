package ru.pankova.Two;

@Two(first = "Example", second = 12)
public class TwoClass {
    private String first;
    private int second;

    public TwoClass(String first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public String getFirst() {
        return first;
    }
}
