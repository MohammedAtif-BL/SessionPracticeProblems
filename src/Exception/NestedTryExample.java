package Exception;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            //Outer Try block
            int[] numbers = {1,2,3};
            try{
                //Inner try Block 1
                int result = numbers[1] / 1;
            } catch (ArithmeticException e){
                e.printStackTrace();
            }

            try {
                //Inner try Block 2
                System.out.println("Try Block 2");
                int number = numbers[5];
                System.out.println(number);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.toString());
            }

            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}