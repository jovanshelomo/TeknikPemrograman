/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregationexample;

import java.io.*;
import java.util.*;

/**
 *
 * @author jovan
 */

class Student {
    String name;
    int id;
    String dept;

    Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

class Department {
    String name;
    private List<Student> students;

    Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Institute {
    String instituteName;
    private List<Department> departments;

    Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInstitute() {
        int noOfStudents = 0;
        List<Student> students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

}

class GFG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Ardhian", 1, "CSE");
        Student s2 = new Student("Wendi", 2, "CSE");
        Student s3 = new Student("Zulfikli", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");

        List <Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);

        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);

        Institute institute = new Institute("BITS", departments);

        System.out.println("Total students in institute: ");
        System.out.println(institute.getTotalStudentsInstitute());
    }

}
