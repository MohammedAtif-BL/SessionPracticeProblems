package Exception.checkedException;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("Demo");
            System.out.println("Class Found");
        } catch (ClassNotFoundException e){
            System.out.println("Class Not Found");
        }

    }
}
