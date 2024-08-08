//package org.example.json;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.*;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class EmployeeManager {
//
//    private static final String FILE_PATH = "employees.json";
//    private static final Gson gson = new Gson();
//    private static final Type employeeListType = new TypeToken<List<Employee>>() {}.getType();
//    static List<Employee> employees = new ArrayList<>();
//    public static void main(String[] args) {
//
//
//        // Create a new employee
//        Employee newEmployee = new Employee();
//        newEmployee.setEmployeeId(3);
//        newEmployee.setName("Example 3");
//        newEmployee.setDepartment("HR");
//        newEmployee.setAddress(new Address("New Street", "New City", "67890"));
//        newEmployee.setProjects(new ArrayList<>());
//
//        employees.add(newEmployee);
//        writeEmployeesToFile(employees);
//
//        // Read all employees
//        employees = readEmployeesFromFile();
//        employees.forEach(System.out::println);
//
//        // Update an existing employee
//        Employee updateEmployee = new Employee();
//        updateEmployee.setName("Update");
//        updateEmployee.setDepartment("HR");
//        updateEmployee.setAddress(new Address("Update Street", "Update City", "12345"));
//        List<Project> projectList = new ArrayList<>();
//        Project projects = new Project(1,"Demo","Pending");
//        projectList.add(projects);
//        updateEmployee.setProjects(projectList);
//        updateEmployee(3,updateEmployee);
//        employees = readEmployeesFromFile();
//        employees.forEach(System.out::println);
////        Employee employeeToUpdate = // Assuming the first employee
////        employeeToUpdate.setName("Updated Name");
////        writeEmployeesToFile(employees);
////
//        // Delete an employee
//        employees.removeIf(emp -> emp.getEmployeeId() == 3);
//        writeEmployeesToFile(employees);
//    }
//
//    private static List<Employee> readEmployeesFromFile() {
//        try (Reader reader = new FileReader(FILE_PATH)) {
//            return gson.fromJson(reader,employeeListType );
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    private static void writeEmployeesToFile(List<Employee> employees) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        try (Writer writer = new FileWriter(FILE_PATH)) {
//            gson.toJson(employees, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Update an existing employee
//    public static void updateEmployee(int id, Employee updatedEmployee) {
//        List<Employee> employees = readEmployeesFromFile();
//        for (Employee emp : employees) {
//            if (emp.getEmployeeId() == id) {
//                emp.setName(updatedEmployee.getName());
//                emp.setDepartment(updatedEmployee.getDepartment());
//                emp.setAddress(updatedEmployee.getAddress());
//                emp.setProjects(updatedEmployee.getProjects());
//                System.out.println("Employee Updated");
//                break;
//            }
//        }
//        writeEmployeesToFile(employees);
//    }
//}
//
