package com.figure.model;

public class Figure {
    private String name;
    private int value;


    public Figure(String name, int value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return name;
    }


    public int getValue() {
        return value;
    }

}