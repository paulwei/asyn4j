package com.googlecode.asyn4j.springbean;

/**
 * Created by weihonglin on 16/6/15.
 */
public class Boy {
    private int age;
    private int seq;
    private String name;

    public Boy() {
    }

    public Boy(int age, String name,int seq) {
        this.age = age;
        this.name = name;
        this.seq = seq;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
