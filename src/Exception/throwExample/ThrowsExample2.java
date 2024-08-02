package Exception.throwExample;

public class ThrowsExample2 {
    public static void main(String[] args) {
        try{
            divide(10,0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void divide(int num1, int num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("Number cannot be zero");
        }
        System.out.println("REsult: "+num1/num2);
    }
}
