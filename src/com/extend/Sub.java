package com.extend;

public class Sub extends Base {
    public Sub() {
        this("11");
        System.out.println("test");
    }
    public Sub(String test) {
        this.zzz = "fff";
        String xxx;
        System.out.println(this.zzz.hashCode());
    }
}
