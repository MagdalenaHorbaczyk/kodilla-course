package com.kodilla.students;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main (String[] args) throws java.lang.Exception {
        Student s1 = new Student("Igor", "Nowak","3c");
        Student s2 = new Student("Alan", "Bartoszewski","3c");
        Student s3 = new Student("Rita", "Celinowska","2a");
        Student s4 = new Student("Dżenifer", "Kot","5d");
        Student s5 = new Student("Kewin", "Kowalski","6b");

        Notes n1 = new Notes();
        Notes n2 = new Notes();
        Notes n3 = new Notes();
        Notes n4 = new Notes();
        Notes n5 = new Notes();

        n1.addGrade(5);
        n1.addGrade(4);
        n2.addGrade(4);
        n2.addGrade(6);
        n2.addGrade(5);
        n3.addGrade(2);
        n3.addGrade(6);
        n3.addGrade(6);
        n3.addGrade(2);
        n4.addGrade(5);
        n4.addGrade(2);
        n5.addGrade(1);

        HashMap<Student, Notes> myMap = new HashMap<Student, Notes>();
        myMap.put(s1, n1);
        myMap.put(s2, n2);
        myMap.put(s3, n3);
        myMap.put(s4, n4);
        myMap.put(s5, n5);

        for(Map.Entry<Student, Notes> entry : myMap.entrySet()) {
            System.out.println("Średnia ocen ucznia : " + entry.getKey() + ": " + entry.getValue().average());
        }
    }
}
