package chap03;

import java.util.Arrays;

public class prac06 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17};
        int key = 8;

        System.out.println(binarySearch(arr, key));
    }


    static int binarySearch(int[] a, int key){
        int l = 0;
        int r = a.length-1;
        //Arrays.binarySearch()

        do{
            //시프트 연산자
            int c = (l+r) >>> 1;

            if(a[c] == key)
                return c;
            else if(a[c] < key)
                l = c+1;
            else
                r = c-1;
        }while(l<=r);

        return -(l+1);
    }
}
