package com.example.theoythay;

public class user {
    private String name;
    private int age;
    private String address;
    private String gender;

    public user(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + address + " - " + gender;
    }
}
