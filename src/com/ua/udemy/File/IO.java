package com.ua.udemy.File;

import com.ua.udemy.ThreeMappSet.AverageStudentGrade;
import com.ua.udemy.ThreeMappSet.SubjectGrade;
import com.ua.udemy.ThreeMappSet.ThreeMapRunner;


import java.io.*;
import java.util.*;

public class IO {
    private static final String FILE_NAME = "GradeBook.txt";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = ThreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();

        writer.writeFile(grades, FILE_NAME);
        reader.readFile(FILE_NAME);
        //   writer.writeWithFormatter();
    }

    private void processGrade(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName) {
        List<Student> students = new ArrayList<>();

        for (AverageStudentGrade gradesKey : grades.keySet()) {
            students.add(new Student(gradesKey.getName(),gradesKey.getAverageGrade(),grades.get(gradesKey)));
        }
        writer.writeObject(students,fileName);
    }

}

