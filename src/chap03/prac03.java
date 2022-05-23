package chap03;

import java.util.Arrays;

public class prac03 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 9, 2, 9, 4, 6, 7, 9};
        int key = 9;
        int[] idx = new int[8];
        int n = 8;

        int count = searchIdx(a, n, key, idx);

        System.out.println("idx : " + Arrays.toString(idx));
        System.out.println("count : " + count);
    }

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int count = 0;

        for(int i=0; i<n; i++)
            if(a[i] == key) idx[count++] = i;

        return count;
    }
}
