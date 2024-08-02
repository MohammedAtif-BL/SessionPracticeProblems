package ds;

public class SearchingExample {
    public static void main(String[] args) {
            int[] number = new int[100];
            int target = 11;

            int result = binarySearch(number,target);
            int result2 = linearSearch(number,target);

            if(result != -1){
                System.out.println("Element fount in index: " +result);
                System.out.println("Element fount in index: " +result2);
            }else {
                System.out.println("Element not found");
            }
    }

    public static int linearSearch(int[] number, int target) {
        int step = 0;
        for (int i=0; i<number.length;i++){
            step++;
            if(number[i] == target){
                System.out.println("Step taken for linear search: " +step);
                return i;
            }
        }
        System.out.println("Step taken for linear search: " +step);
        return -1;
    }

    public static int binarySearch(int[] number, int target) {
        int step = 0;
       int left = 0;
       int right = number.length -1;

       while(left<=right){
           step++;
           int mid = (left + right) /2;

           if(number[mid] == target){
               System.out.println("Step taken for binary search: " +step);
               return mid;
           } else if(number[mid] < target){
               left = mid + 1;
           } else {
               right = mid -1;
           }
       }
        System.out.println("Step taken for binary search: " +step);
        return -1;
    }
}
