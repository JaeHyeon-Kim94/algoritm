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

        while(left<right){
            for(int i=0; i<right; i++){
                if(a[i] > a[i+1]){
                    swap(a, i, i+1);
                    last = i;
                }
            }
            right = last;

            for(int i=right; i>left; i--){
                if(a[i-1] > a[i]){
                    swap(a, i-1, i);
                    last = i;
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
