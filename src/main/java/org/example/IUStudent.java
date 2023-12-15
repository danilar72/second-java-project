package org.example;

public class IUStudent extends Student{
    public IUStudent(String FIO, int course, int grade) {
        super(FIO, course, grade);
    }

    @Override
    public void writeExam() {
        System.out.println("IUStudent write exam.");
    }
}
