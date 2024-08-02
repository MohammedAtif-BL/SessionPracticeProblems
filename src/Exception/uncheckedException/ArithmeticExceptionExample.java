package Exception.uncheckedException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 /3;
            String str = "Hello";
            System.out.println(result);
            System.out.println(str.length());
            int[] array = new int[5];
            System.out.println(array[5]);
        }  catch (ArithmeticException e){
            System.out.println("CAnnot divide by zero");
        } catch (NullPointerException e){
            System.out.println("String Cannot be null");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Be in limit");
        } catch (Exception e){
            System.out.println("String cannot be null");
        }

        System.out.println("Rest of statement/Program ");
    }
}
