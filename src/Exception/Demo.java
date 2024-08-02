package Exception;

public class Demo {
    public static void main(String[] args) {
        int i=2;
        int j=0;

        try{
            int sum = 2 - 2;
            System.out.println(sum);
        } catch (Exception e){
            System.out.println("Something happen");
        }


        System.out.println("SOme statement");
    }
}
