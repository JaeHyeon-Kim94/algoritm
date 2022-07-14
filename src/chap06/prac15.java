package chap06;

import java.util.Arrays;

public class prac15 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static int sortMedain(int[] a, int x, int y, int z){
        if(a[x] > a[y]) swap(a, x, y);
        if(a[y] > a[z]) swap(a, y, z);
        if(a[x] > a[y]) swap(a, x, y);
        return y;
    }
    static void insertionSort(int[] a, int left, int right){
        for(int i=left+1; i<=right; i++){
            int j;
            int key = a[i];
            for(j = i; j>left && a[j-1] > key; j--){
                a[j] = a[j-1];
            }
            a[j] = key;
        }
    }

    static void quickSort_recursive(int[] a, int left, int right){
        if(right - left < 9){
            insertionSort(a, left, right);
            System.out.printf("[%d]부터 [%d]까지 삽입 정렬(%s)\n", left, right, "재귀");
        }else {
            int l = left;
            int r = right;
            System.out.printf("[%d]부터 [%d]까지 퀵정렬(%s)\n", l, r, "재귀");
            int m = sortMedain(a, l, (l+r)/2, r);
            int pivot = a[m];
            swap(a, m, r-1);
            l++;
            r--;

            do {
                while (a[l] < pivot) l++;
                while (a[r] > pivot) r--;
                if (l <= r) swap(a, l++, r--);
            } while (l <= r);

            if (left < r) quickSort_recursive(a, left, r);
            if (l < right) quickSort_recursive(a, l, right);
        }
    }

    static void quickSort_non_recursive(int[] a, int left, int right) throws Exception {
        Stack lStk = new Stack(right - left + 1);
        Stack rStk = new Stack(right - left + 1);

        lStk.push(left);
        rStk.push(right);

        while(!lStk.isEmpty()){
            int l = left = (int) lStk.pop();
            int r = right = (int) rStk.pop();
            if(r - l < 9){
                insertionSort(a, l ,r);
                System.out.printf("[%d]부터 [%d]까지 삽입 정렬(%s)\n", l, r, "비재귀");
            }else {
                System.out.printf("[%d]부터 [%d]까지 퀵정렬(%s)\n", l, r, "비재귀");
                int pivot = sortMedain(a, a[l], a[(l+r)/2], a[r]);

                do {
                    while (a[l] < pivot) l++;
                    while (a[r] > pivot) r--;
                    if (l <= r) swap(a, l++, r--);
                } while (l <= r);

                if(r - left > right - l){
                    System.out.println("교체 시작");
                    int tmp;
                    tmp = right;
                    right = r;
                    r = tmp;

                    tmp = l;
                    l = left;
                    left = tmp;
                }

                if(l < right){
                    lStk.push(l);
                    rStk.push(right);
                }
                if(left < r){
                    lStk.push(left);
                    rStk.push(r);
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{31, 5, 63, 19, 38, 53, 13, 29, 68, 33, 61, 55, 96, 86};
        quickSort_recursive(a, 0, 9);
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
