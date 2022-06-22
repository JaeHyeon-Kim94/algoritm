package chap06;

import java.util.Arrays;

public class exec06_4 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void selectionSort(int[] a, int n){
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 1, 3, 4, 6, 7, 8};

        System.out.println(Arrays.toString(arr));
        selectionSort(arr, 7);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
