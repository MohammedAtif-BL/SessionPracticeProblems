package org.example.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonCRUDExample {
    private static final String FILE_PATH = "employees.json";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        // Create sample data

//        employee.setProjects(projects);

//        Employee employee = addData();
        // Create
        writeEmployeeToFile(addData());
        writeEmployeeToFile(addData());

        // Read
        List<Employee> employees = readEmployeesFromFile();
        System.out.println("Read Employees: " + employees);

        // Update
        if (employees != null && !employees.isEmpty()) {
            Employee empToUpdate = employees.get(0);
            empToUpdate.setName("Updated Name");
            writeEmployeesToFile(employees);
            System.out.println("Updated Employees: " + readEmployeesFromFile());
        }

        // Delete
//        deleteEmployeeFromFile(3);
    }

    public static Employee addData(){
        Address address = new Address("Update Street", "Update City", "12345");
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, "Demo", "Pending"));

        Employee employee = new Employee(3, "Update", "HR", address,projects);
        return employee;
    }

    public static void writeEmployeeToFile(Employee employee) {
        try {
            List<Employee> employees = readEmployeesFromFile();
            if (employees == null) {
                employees = new ArrayList<>();
            }
            employees.add(employee);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), employees);
            System.out.println("Employee data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readEmployeesFromFile() {
        try {
            return objectMapper.readValue(new File(FILE_PATH), new TypeReference<List<Employee>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeEmployeesToFile(List<Employee> employees) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), employees);
            System.out.println("Employee data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployeeFromFile(int employeeId) {
        try {
            List<Employee> employees = readEmployeesFromFile();
            if (employees != null) {
                employees.removeIf(emp -> emp.getEmployeeId() == employeeId);
                writeEmployeesToFile(employees);
                System.out.println("Employee with ID " + employeeId + " deleted.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

