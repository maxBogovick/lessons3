package com;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private long studentTicket;
    private int age;
    private String sex;
    private boolean hasMilitaryTicket;

    private boolean isEmpty(final String value) {
        return (Objects.isNull(value) || value.trim().length() == 0);
    }

    private boolean validateName(final String name) {
        if (isEmpty(name)) return false;
        return name.replaceAll("[^0-9]", "").length() == 0;
    }

    public void setFirstName(String firstName) {
        if (!isEmpty(this.firstName)) return;
        if (validateName(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (validateName(lastName)) {
            this.lastName = lastName;
        }
    }

    public void setMiddleName(String middleName) {
        if (validateName(middleName)) {
            this.middleName = middleName;
        }
    }

    public Student() {
    }

    private Student(String firstName, String last, String middle) {
        setFirstName(firstName);
        setLastName(last);
        setMiddleName(middle);
    }

    public String getName() {
        return firstName;
    }

    public static String getName(Student student) {
        return student.firstName;
    }

    public static Student CREATE_STUDENT(String firstName, String last, String middle) {
        return new Student(firstName, last, middle);
    }
    
    public String getFIO() {
        return "full fio student  firstName = " + firstName + " last name = " + lastName + " middle name = " + middleName;
    }
}
