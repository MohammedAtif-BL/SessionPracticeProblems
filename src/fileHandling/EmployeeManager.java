package fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    public static final String FILE_NAME = "employee.txt";
    static List<Employee> employees;
    public static void main(String[] args) {
        employees = readEmployeefromFile();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Employee Management ");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayEmployees();
                    break;

                case 3:
                    updateEmployee(scanner);
                    break;

                case 4:
                    deleteEmployee(scanner);
                    break;
            }
        }
    }

    public static void deleteEmployee(Scanner scanner) {
        System.out.println("Enter Employee Id to Delete:");
        int empId = scanner.nextInt();

        Employee searchEmployee = searchEmployee(employees, empId);
        if(searchEmployee == null){
            System.out.println("Employee Not Found");
            return;
        }

        employees.removeIf(emp -> emp.getEmpId() == empId);
        System.out.println("Employee Deleted");
        writeEmployeeToFile();
    }

    private static void updateEmployee(Scanner scanner) {
        System.out.println("Employee Id to Update:");
        int empId = scanner.nextInt();
        scanner.nextLine();

        Employee existingEmployee = searchEmployee(employees, empId);
        if(existingEmployee == null){
            System.out.println("Employee Not Found");
            return;
        }
        System.out.println("Enter new EMployee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter new Salary:");
        double salary = scanner.nextDouble();

        Employee updatedemployee = new Employee(empId, name, salary);
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).getEmpId() == empId){
                employees.set(i,updatedemployee);
                System.out.println("EMployee Updated");
                break;
            }
        }
        writeEmployeeToFile();
    }

    public static Employee searchEmployee(List<Employee> employees, int empId) {
        for (Employee employee : employees){
            if(employee.getEmpId() == empId){
                return employee;
            }
        }
        return null;
    }

    private static List<Employee> readEmployeefromFile() {
        List<Employee> employees = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;

            while ((line = reader.readLine()) != null){
                employees.add(Employee.readFromFile(line));

            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return employees;
    }

    public static void writeEmployeeToFile() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Employee employee:employees){
                writer.write(employee.toString());
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void addEmployee(Scanner scanner) {

        System.out.print("Enter Employee Id:" );
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name:" );
        String  name = scanner.nextLine();

        System.out.print("Enter Employee Salary:" );
        double salary = scanner.nextDouble();

        Employee newEmployee = new Employee(empId,name,salary);
        employees.add(newEmployee);
        writeEmployeeToFile();
    }
    public static void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
