package ds;

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] array = {2,5,1,3,23,11,10};
        int size = array.length;

        mergeSort(array,0,size-1);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort(int[] array, int start, int end) {
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int i,j,k;
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (i = 0; i<n1; i++)
            leftArray[i] = array[start+i];

        for (j = 0; j<n2; j++)
            rightArray[j] = array[mid+1+j];

        i=0;
        j=0;
        k= start;

        while(i<n1 && j< n2){
            if (leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
//        System.out.println(Arrays.toString(array));

    }
}
