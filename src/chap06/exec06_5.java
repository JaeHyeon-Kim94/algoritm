package chap06;

public class exec06_5 {
    static void insertionSort(int[] a, int n){
        for(int i=1; i<n; i++){
            int j;
            int key = a[i];

            for(j=i; j>0 && a[j-1] > key; j--){
                a[j] = a[j-1];
            }
            a[j] = key;
        }
    }
}
