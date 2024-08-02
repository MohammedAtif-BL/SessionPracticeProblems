package Exception.throwExample;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            validateAge(17);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static void validateAge(int age) {
        if(age < 18 ){
            throw new IllegalArgumentException("You must be 18+ to Vote ");
        } else {
            System.out.println("Welcome");
        }
    }
}
