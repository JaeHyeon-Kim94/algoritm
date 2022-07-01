package chap06;

public class exec06_6 {
    static void shellSort(int[] a, int n){
        for(int h = n/2; h>0; h/=2){
            for(int i=h; i<n; i++){
                int j;
                int key = a[i];
                for(j = i; j>=0 && a[j-h] > key; j-=h){
                    a[j] = a[j-h];
                }
                a[j] = key;
            }
        }
    }
}
