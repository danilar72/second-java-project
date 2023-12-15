package org.example;

public class MathStudent extends Student {
    public MathStudent(String FIO, int course, int grade) {
        super(FIO, course, grade);
    }

    @Override
    public void writeExam() {
        System.out.println("MathStudent write exam.");
    }
}
