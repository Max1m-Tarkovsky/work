package com.ua.udemy.File;

import com.ua.udemy.ThreeMappSet.AverageStudentGrade;
import com.ua.udemy.ThreeMappSet.SubjectGrade;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Writer {
    public void writeWithFormatter() throws FileNotFoundException {
        Formatter formatter = new Formatter("BankAccounts.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter : Client id, Client Name, Client Surname, Account balance  ");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d %s %s: %d %n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input incorrect, Pleas try again ");
                scanner.nextLine();
            }
        }
        formatter.close();
    }


    public void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {

            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("==================================\n");
                writer.write("Student name " + gradeKey.getName() + " \nAverage Grade " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject : " + grade.getSubject() + " ---> Grade : " + grade.getGrade() + "\n");

                }
            }

        }
    }
    public void writeObject (List<Student> students,String fileName){

    }
}
