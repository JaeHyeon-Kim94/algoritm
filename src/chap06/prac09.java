package chap06;

import java.util.Arrays;

public class prac09 {
    static void shellSort_v1(int[] a, int n){
        int moveCount = 0;

        for(int interval = n/2; interval >=1; interval /= 2){
            for(int start = interval; start<n; start++){
                int j, tmp = a[start];
                for(j = start - interval; j >= 0 && a[j] > tmp; j -= interval){
                    a[j + interval] = a[j];
                    moveCount++;
                }
                a[j + interval] = tmp;moveCount++;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println("v1 이동 횟수 : " + moveCount);
    }

    static void shellSort_v2(int[] a, int n){
        int interval = 1;
        int moveCount = 0;
        while(n/9 > interval) interval = 3*interval + 1;

        for(; interval>0; interval /= 3){
            for(int start = interval; start<n; start++){
                int j, tmp = a[start];
                for(j = start - interval; j>=0 && a[j] > tmp; j -= interval){
                    a[j + interval] = a[j];
                    moveCount++;
                }
                a[j + interval] = tmp;moveCount++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("v2 이동 횟수 : " + moveCount);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 7, 4, 5, 2, 6, 3, 9, 11};

        shellSort_v1(new int[]{1, 8, 7, 4, 5, 2, 6, 3, 9, 11, 15, 23, 19, 31, 22}, 15);

        System.out.println("////////////////////////////////////////");

        shellSort_v2(new int[]{1, 8, 7, 4, 5, 2, 6, 3, 9, 11, 15, 23, 19, 31, 22}, 15);
    }
}
