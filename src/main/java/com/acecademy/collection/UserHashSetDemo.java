package com.acecademy.collection;

import java.util.HashSet;
import java.util.Set;

public class UserHashSetDemo {


    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student("John", "A", 10));
        students.add(new Student("John", "B", 20));
        students.add(new Student("John", "A", 30));
        students.add(new Student("Watson", "C", 50));
        System.out.println(students);


/*        Student student1 = new Student("John", 10);
        Student student2 = new Student("John", 100);

        System.out.println(student1.equals(student2));*/
    }

}

class Student implements Comparable<Student> {
    String name;
    String surname;
    int marks;

    public Student(String name, String surname, int marks) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        if (obj == this) return true;
        Student s1 = (Student) obj;
        if (this.hashCode() != s1.hashCode()) return false;
        return name.equals(s1.name) && surname.equals(s1.surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s1) {
        if (this.marks == s1.marks) {
            return this.name.compareTo(s1.name);
        }
        return Integer.compare(s1.marks, this.marks);
    }
}


