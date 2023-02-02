package br.com.alura.course;

import java.util.Objects;

public class Student {

    private String name;
    private int registrationNumber;

    public Student(String name, int registrationNumber) {
        if(name == null){
            throw new NullPointerException("The name can not be null.");
        }
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return registrationNumber == student.registrationNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrationNumber);
    }

    @Override
    public String toString() {
        return "Student: "
                + name
                + ", registration number: " + registrationNumber
                + ".";
    }
}
