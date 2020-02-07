package model;

import model.Student;

import java.util.Arrays;

public class Teacher {
    String name;
    Student[] students;

    public void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = student;
    }

    public void viewStudent() {
        for (int i=0; i<this.students.length; i++) {
            System.out.println(students[i].name);
        }
    }

    public Teacher(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public Teacher() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}
