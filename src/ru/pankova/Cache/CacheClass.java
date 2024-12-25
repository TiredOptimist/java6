package ru.pankova.Cache;

@Cache(value = {"value1", "value2", "value3"})
public class CacheClass {
    private String first;
    private int second;
    private double third;

    public CacheClass(String first, int second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }
}

