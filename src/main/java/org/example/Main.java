package org.example;

public class Main {
    public static void main(String[] args) {
        IUStudent Student1 = new IUStudent("Гасанов Антон Евгеньевич",1,2);
        MathStudent Student2 = new MathStudent("Емельянов Григорий Павлович",2,5);

        Student1.writeExam();
        Student2.writeExam();
    }
}