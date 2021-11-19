package ru.mirea.task12;

import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student> {
    private int id;
    private double gpa;
    private String name;

    public Student(int id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public double getGpa() {
        return this.gpa;
    }
    public String getName() {
        return this.name;
    }
    public int compare(Student o1, Student o2) {
        double res = o1.getGpa() - o2.getGpa();
        return Double.compare(res, 0.0);
    }
    public int compareTo(Student other) {
        return this.id - other.getId();
    }
}
