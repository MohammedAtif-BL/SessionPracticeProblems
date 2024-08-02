package Exception.throwExample;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            method1();
        } catch (ArithmeticException e ){
            e.toString();
        }

    }

    public static void method1 (){
        method2();
        method3();
    }

    public static void method2() throws ArithmeticException{
        int result  = 10/0;
        System.out.println(result);
    }

    public static void method3() throws ArithmeticException{
        int result  = 2 /0;
        System.out.println(result);
    }
}
