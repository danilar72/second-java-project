package org.example;

public abstract class Student {
    private String FIO;
    private int course;
    private int grade;
    public Student(String FIO, int course,int grade) {
        this.FIO=FIO;
        this.course=course;
        this.grade=grade;
    }

    public abstract void writeExam();
}
