package com.kodilla.students;

import java.util.ArrayList;
import java.util.List;

public class Notes {
    List<Integer> grades = new ArrayList<>();

    public Notes() {
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double average() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
