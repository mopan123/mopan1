package com.example.demo;

public class Kh {
    private int age;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Kh() {
        super();
    }

    public Kh(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
