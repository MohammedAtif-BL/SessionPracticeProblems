package Exception.checkedException;

public class TryWIthOutCatchExample {
    public static void main(String[] args) {
        try{
            int num = 10 /0;
        } finally {
            System.out.println("Finally Block");
        }
    }
}
