package com.test;

import java.util.Arrays;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(int... names) {
        System.out.println(Arrays.toString(names));
    }

    public void getName() {
        System.out.println(this.name);
    }
}
