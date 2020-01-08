package com.kodilla.students;

public class Student {
    private String firstName;
    private String lastName;
    private String classId;

    public Student(String firstName, String lastName, String classId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        final Student e = (Student) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.classId.equals(e.classId);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(classId.substring(0, 1));
    }

    @Override
    public String toString() {
        return firstName + "  " + lastName + " (" + classId + ")";
    }
}
