package com.example.SpringBootMongoDB.Test;

import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private transient int age; // Marked as transient

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}