package chap06;

import java.util.Arrays;

public class prac15 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static int getMedian(int[] a, int x, int y, int z){
        if(a[x] > a[y]) swap(a, x, y);
        if(a[y] > a[z]) swap(a, y, z);
        if(a[x] > a[y]) swap(a, x, y);

        return y;
    }

    static void insertionSort(int[] a, int left, int right){
        int n = right - left;
        for(int i = left+1; i<=right; i++){
            int key = a[i];
            int j;
            for(j=i; j>left && a[j-1] > key; j--){
                a[j] = a[j-1];
            }
            a[j] = key;
        }
    }

    static void quickSort_recursive(int[] a, int left, int right){
        if(right - left < 9){
            insertionSort(a, left, right);
        }else{
            int l = left;
            int r = right;
            int m = getMedian(a, l, (l+r)/2, r);
            int pivot = a[m];

            swap(a, m, right-1);
            l++;
            r-=2;

            do{
                while(a[l] < pivot) l++;
                while(a[r] > pivot) r--;
                swap(a, l++, r--);
            }while(l<=r);

            if(r - left > right - l){
                int tmp = r;
                r = right;
                right = tmp;
                tmp = l;
                l = left;
                left = tmp;
            }

            if(right > l) quickSort_recursive(a, l, right);
            if(r > left) quickSort_recursive(a, left, r);
        }
    }

    static void quickSort_non_recursive(int[] a, int left, int right) throws Exception{
        Stack lstk = new Stack(right - left + 1);
        Stack rstk = new Stack(right - left + 1);

        lstk.push(left);
        rstk.push(right);

        while(!lstk.isEmpty()){
            int l = left = (int)lstk.pop();
            int r = right = (int)rstk.pop();
            int m = getMedian(a, l, (l+r)/2, r);
            int pivot = a[m];
            swap(a, m, r-1);
            l++; r-=2;
            do{
                while(a[l] < pivot) l++;
                while(a[r] > pivot) r--;
                if(l<=r) swap(a, l++, r--);
            }while(l<=r);

            if(r - left > right - l){
                int tmp = r;
                r = right;
                right = tmp;
                tmp = l;
                l = left;
                left = tmp;
            }

            if(right > l){
                lstk.push(l);
                rstk.push(right);
            }
            if(r > left){
                lstk.push(left);
                rstk.push(r);
            }
        }
    }
}
