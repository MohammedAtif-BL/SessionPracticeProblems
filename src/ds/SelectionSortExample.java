package ds;

import java.util.Arrays;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {4,11,91,2,7,6};
        int size = array.length;

        for (int i=0; i<size-1; i++){
            int min = i;
            for(int j=i+1;j<size;j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            if (min!=array[i]){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
