package com.callmegerbs;

/**
 * @author gabsy
 * @version 1.0
 */

public class MainClass {
    public static void main(String[] args) {
        Person A = new Person();
        Person B = new Person("Gabriel", "Dobrin", 12);

        A.setFname("Alex");
        System.out.println(A.getFname());

        A.setAge(32);
        System.out.println(A.getAge());

        System.out.println(A);

        Student S = new Student();
        Student S1 = new Student("Op", "Pop", 30);

        System.out.println(S);
        System.out.println(S1);
    }
}
