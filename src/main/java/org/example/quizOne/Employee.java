package org.example.quizOne;


import lombok.Data;

@Data
public class Employee {

    private String name;

    private String department;

    private double salary;

    public Employee(String name, String department, int i) {
        this.name = name;
        this.department = department;
        this.salary = i;
    }
}
