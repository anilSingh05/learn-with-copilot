package org.example.quizOne;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainAppTest {

    @Test

    public void testEmployeeCreation() {

        Employee emp = new Employee("John", "Engineering", 60000);

        assertEquals("John", emp.getName());

        assertEquals("Engineering", emp.getDepartment());

        assertEquals(60000, emp.getSalary(), 0.01);

    }



    @Test

    public void testMainFunction() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Engineering", 60000));

        employees.add(new Employee("Jane", "Engineering", 70000));

        employees.add(new Employee("Alice", "HR", 50000));

        employees.add(new Employee("Bob", "HR", 55000));

        employees.add(new Employee("Charlie", "Marketing", 65000));

        employees.add(new Employee("David", "Marketing", 75000));



        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));



        Main.main(null);



        String expectedOutput = "Employees in Engineering with salary higher than average salary:\r\n" +

                "- Jane: $70000\r\n" +

                "Employees in HR with salary higher than average salary:\r\n" +

                "- Bob: $55000\r\n" +

                "Employees in Marketing with salary higher than average salary:\r\n" +

                "- David: $75000\r\n";

        assertEquals(expectedOutput, outContent.toString());

    }
}