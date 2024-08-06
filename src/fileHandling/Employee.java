package fileHandling;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empId+","+name+","+salary;
    }

    public static Employee readFromFile(String employeeData){
        String[] data = employeeData.split(",");
        return  new Employee(
                Integer.parseInt(data[0]),
                data[1],
                Double.parseDouble(data[2])
        );
    }
}
