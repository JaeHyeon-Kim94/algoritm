package chap06;

import java.util.Arrays;

public class prac14 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static int getMedian(int a, int b, int c){
        if(a>=b)
            if(b>=c)
                return b;
            else if(a>=c)
                return c;
            else
                return a;
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
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

    static void quickSort_non_recursive(int[] a, int left, int right){
        if(right - left < 9){
            insertionSort(a, left, right);
        }else{
            int l = left;
            int r = right;
            int pivot = getMedian(a[l], a[(l + r)/2], a[r]);

            do{
                while(a[l] < pivot) l++;
                while(a[r] > pivot) r--;
                if(l<=r) swap(a, l++, r--);
            }while(l<=r);

            if(r - left > right - l){
                int tmp;
                tmp = right;
                right = r;
                r = tmp;

                tmp = left;
                left = l;
                l = tmp;
            }

            if(right > l) quickSort_non_recursive(a, l, right);
            if(r > left) quickSort_non_recursive(a, left, r);
        }
    }

    static void quickSort_recursive(int[] a, int left, int right) throws Exception {
        Stack lstk = new Stack(right - left + 1);
        Stack rstk = new Stack(right - left + 1);

        lstk.push(left);
        rstk.push(right);

        while(!lstk.isEmpty()){
            int l = left = (int) lstk.pop();
            int r = right = (int) rstk.pop();

            if(r - l < 9){
                insertionSort(a, l, r);
            }else{
                int pivot = getMedian(a[l], a[(l + r)/2], a[r]);

                do{
                    while(a[l] < pivot) l++;
                    while(a[r] > pivot) r--;
                    if(l<=r) swap(a, l++, r--);
                }while(l<=r);

                if(r - left > right - l){
                    int tmp;
                    tmp = right;
                    right = r;
                    r = tmp;

                    tmp = left;
                    left = l;
                    l = tmp;
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
}

