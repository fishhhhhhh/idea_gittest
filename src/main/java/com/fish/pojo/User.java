package com.fish.pojo;

/**
 * @author Fish
 * @version 1.0
 * @date 2020/1/2 9:26
 */
public class User {
    private String name;
    private int age;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

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
}
