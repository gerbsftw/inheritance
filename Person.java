package com.callmegerbs;

/**
 * @author gabsy
 * @version 1.0
 */

public class Person {
    int age;
    String fname;
    String lname;

    {
        age = 0;
        fname = "Unknown";
        lname = "Unknown";
    }

    Person() {
        age = age;
        fname = fname;
        lname = lname;
    }

    Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    // get methods
    public String getFname() {
        return this.fname;
    }

    public int getAge() {
        return this.age;
    }

    public String getLname() {
        return this.lname;
    }

    // set methods

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    // toString

    @Override
    public String toString() {
        return fname + " " + lname + " is " + age + " years old.";
    }
}
