//package csvfile;
//
//import java.util.Scanner;
//
//public class CsvFileHandler {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//
//        while (!exit) {
//            System.out.println("Choose an option:");
//            System.out.println("1. Add Employee");
//            System.out.println("2. Update Employee");
//            System.out.println("3. Delete Employee");
//            System.out.println("4. Search Employee");
//            System.out.println("5. Display All Employees");
//            System.out.println("6. Exit");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    addEmployee(scanner);
//                    break;
//                case 2:
//                    updateEmployee(scanner);
//                    break;
//                case 3:
//                    deleteEmployee(scanner);
//                    break;
//                case 4:
//                    searchEmployee(scanner);
//                    break;
//                case 5:
//                    displayAllEmployees();
//                    break;
//                case 6:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Invalid choice. Try again.");
//            }
//        }
//
//        scanner.close();
//    }
//}
