package Exception.throwExample;

class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message){
        super(message);
    }
}
public class ThrowExample1 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j = 10 /i;
            if(j==0){
                throw new InvalidInputException("Number cannot divide by zero");
            }
        }catch (ArithmeticException e){
            j = 10/1;
            System.out.println("That's a default output: "+ e.getMessage());
        }
        System.out.println(j);
    }
}
