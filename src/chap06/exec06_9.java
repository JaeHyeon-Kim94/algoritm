package chap06;

import java.util.Arrays;

public class exec06_9 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static void quickSort(int[] a, int left, int right){
        int l = left;
        int r = right;
        int pivot = a[(l + r)/2];

        System.out.printf("a[%d] ~ a[%d] : {", left, right);
        for (int i=left; i<right; i++)
            System.out.printf("%d, ", a[i]);
        System.out.printf("%d}\n", a[right]);

        do{
            while(a[l]<pivot) l++;
            while(a[r]>pivot) r--;

            if(l<=r) swap(a, l++, r--);
        }while(l<=r);

        if(left < r) quickSort(a, left, r);
        if(l < right) quickSort(a, l, right);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 4, 2, 6, 1, 3, 9, 7};
        quickSort(a, 0, 8);

        System.out.println(Arrays.toString(a));
    }
}
