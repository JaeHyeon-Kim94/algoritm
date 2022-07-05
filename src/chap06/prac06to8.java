package chap06;

import java.util.Arrays;

public class prac06to8 {
    public static void swap(int[] a, int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
    //선택 정렬
    static void sort(int[] a, int n){
        for(int i=0; i<n; i++){
            int min = i;

            for(int j = i+1; j<n; j++){
                if(a[min] > a[j]) min = j;
            }

            for(int m=0; m<n; m++)
                System.out.print(m == i ? "  *" : m==min ? "  +" : "   ");
            System.out.println();
            for(int m=0; m<n; m++){
                System.out.printf("%3d", a[m]);
            }
            System.out.println();

            swap(a, i, min);
        }
    }
    //삽입 정렬
    static void sort_1(int[] a, int n){
        for(int i=1; i<n; i++){
            int j, tmp = a[i];
            for(j = i; j>0 && a[j-1] > tmp; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
    //보초법
    static void insertionSort(int[] a, int n) {
        for(int i=2; i<n; i++){
            int tmp= a[0] = a[i];

            int j = i;

            while(a[j-1]>tmp){
                a[j] = a[j-1];
                j--;
            }
            if(j>0) a[j] = tmp;
        }
    }
    //이진 검색을 이용한 삽입 정렬
    static void insertionSort_1(int[] a, int n){
        for(int i=1; i<n; i++){
            int l = 0;
            int r = i-1;
            int key = a[i];
            int c, idx;

            do{
                c = (l+r)/2;
                if(a[c] == key) break;
                else if(a[c] < key) l = c+1;
                else r = c-1;
            }while(l<=r);
            idx = (l<=r) ? c+1 : r+1;

            for(int j=i; j>idx; j--){
                a[j] = a[j-1];
            }
            a[idx] = key;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 8, 3, 1, 9, 7};
        System.out.println(Arrays.toString(arr));
        insertionSort_1(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
}
