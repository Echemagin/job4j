package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student andrew = new Student();
        andrew.setFullName("Andrew Johnson");
        andrew.setGroup("IT-12");
        andrew.setAdmissionDate(new Date());

        System.out.println(
                "Student: " + andrew.getFullName() + System.lineSeparator()
                + "Student's group: " + andrew.getGroup() + System.lineSeparator()
                + "Student's admission date: " + andrew.getAdmissionDate()
        );
    }
}
