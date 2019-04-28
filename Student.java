package com.callmegerbs;

/**
 * @author gabsy
 * @version 1.0
 */

public class Student extends Person {
    int age;
    String fname;
    String lname;

    Student() {
        super();
    }

    Student(String Fname, String Lname, int Age) {
        super(Fname, Lname, Age);
    }
}
