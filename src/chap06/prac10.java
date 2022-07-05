package chap06;

public class prac10 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }


    static void quickSort(int[] a, int left, int right){
        int l = left;
        int r = right;
        int pivot = a[(l + r)/2];

        do{
            while(a[l]<pivot) l++;
            while(a[r]>pivot) r--;

            if(l<=r) swap(a, l++, r--);
        }while(l<=r);

        if(left < r) quickSort(a, left, r);
        if(l < right) quickSort(a, l, right);
    }

    static void quickSort(int[] a, int n){quickSort(a, 0, n-1);}
}
