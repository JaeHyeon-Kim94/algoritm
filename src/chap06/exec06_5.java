package chap06;

public class exec06_5 {
    public static void swap(int[] a, int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    public static void insertionSort(int[] a, int n){
        for(int i=1; i<n; i++){
            int j;
            int tmp = a[i];

            for(j = i; j>0 && a[j-1] > tmp; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
}
