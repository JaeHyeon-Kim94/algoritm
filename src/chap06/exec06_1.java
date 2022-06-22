package chap06;

import java.util.Arrays;

public class exec06_1 {
    //교환 메서드
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    //정렬 메서드
    static void bubbleSort_1(int[] a, int n){
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j > i; j--){
                if(a[j]<a[j-1]) swap(a, j-1, j);
            }
        }
    }
    //수행 방향 변경
    static void bubbleSort_2(int[] a, int n){
        for(int i=n-1; i>0; i--){
            for(int j=0; j < i; j++){
                if(a[j]>a[j+1]) swap(a, j, j+1);
            }
        }
    }
    //알고리즘 개선 1
    static void bubbleSort_3(int[] a, int n){
        for(int i=n-1; i>0; i--){
            int exchg = 0;
            for(int j=0; j < i; j++){

                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    exchg++;
                }
            }
            if(exchg == 0) break;
        }
    }

    //알고리즘 개선 2
    static void bubbleSort_4(int[] a, int n){
        int 비교횟수 = 0;
        int 교환횟수 = 0;

        for(int i=n-1; i>0; i--){
            int last = n-2;
            for(int j=0; j < i; j++){
                비교횟수++;
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                    교환횟수++;
                    last = j+1;
                }
            }
            if(i>last) i = last;
        }
        System.out.println(비교횟수);
        System.out.println(교환횟수);
    }

    public static void main(String[] args) {
        int[] x = new int[]
                //{22, 5, 11, 32, 68, 70, 120};
                {7, 5, 9, 0, 3, 1, 6, 2, 4, 8, 10, 11, 12, 13, 14, 15 ,16};

        System.out.println("정렬 전 : "+ Arrays.toString(x));
        bubbleSort_4(x, 17);
        //bubbleSort_2(x, 7);
        System.out.println("정렬 후 : "+ Arrays.toString(x));
    }
}
