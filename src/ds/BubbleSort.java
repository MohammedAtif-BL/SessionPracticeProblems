package ds;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,11,1,3,2,5,4};
        int size = array.length;

        for (int i=0; i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
