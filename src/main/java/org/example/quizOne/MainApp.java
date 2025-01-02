package org.example.quizOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Engineering", 60000));

        employees.add(new Employee("Jane", "Engineering", 70000));

        employees.add(new Employee("Alice", "HR", 50000));

        employees.add(new Employee("Bob", "HR", 55000));

        employees.add(new Employee("Charlie", "Marketing", 65000));

        employees.add(new Employee("David", "Marketing", 75000));



        Map<String, Double> departmentSalarySum = new HashMap<>();

        Map<String, Integer> departmentEmployeeCount = new HashMap<>();



        for (Employee emp : employees) {

            departmentSalarySum.put(emp.getDepartment(), departmentSalarySum.getOrDefault(emp.getDepartment(), 0.0) + emp.getSalary());

            departmentEmployeeCount.put(emp.getDepartment(), departmentEmployeeCount.getOrDefault(emp.getDepartment(), 0) + 1);

        }



        Map<String, Double> departmentAvgSalary = new HashMap<>();

        for (Map.Entry<String, Double> entry : departmentSalarySum.entrySet()) {

            String department = entry.getKey();

            double salarySum = entry.getValue();

            int employeeCount = departmentEmployeeCount.get(department);

            departmentAvgSalary.put(department, salarySum / employeeCount);

        }



        Map<String, List<Employee>> employeesAboveAvgSalary = new HashMap<>();

        for (Employee emp : employees) {

            if (emp.getSalary() > departmentAvgSalary.get(emp.getDepartment())) {

                employeesAboveAvgSalary.putIfAbsent(emp.getDepartment(), new ArrayList<>());

                employeesAboveAvgSalary.get(emp.getDepartment()).add(emp);

            }

        }



        // Display employees with salary higher than average salary in their department

        for (Map.Entry<String, List<Employee>> entry : employeesAboveAvgSalary.entrySet()) {

            String department = entry.getKey();

            List<Employee> empList = entry.getValue();

            System.out.println("Employees in " + department + " with salary higher than average salary:");

            for (Employee emp : empList) {

                System.out.println("- " + emp.getName() + ": $" + emp.getSalary());

            }

        }


    }
}
