package chap06;

import java.util.Arrays;

public class prac05 {

    public static void swap(int[] a, int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    public static void shakerSort(int[] a, int n){
        int left = 0;
        int right, last = right = n-1;

        while(left < right){
            for(int j = left; j<right; j++){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                    last = j;
                }
            }
            right = last;

            for(int j = right; j>left; j--){
                if(a[j-1] > a[j]){
                    swap(a, j-1, j);
                    last = j;
                }
            }
            left = last;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 1, 3, 4, 6, 7, 8};

        System.out.println(Arrays.toString(arr));
        shakerSort(arr, 7);
        System.out.println(Arrays.toString(arr));
    }

}
