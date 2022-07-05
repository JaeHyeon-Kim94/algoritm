package chap06;

public class exec06_6 {
    static void shellSort(int[] a, int n){
        for(int interval=n/2; interval>=1; interval/=2){
            for(int i=interval; i<n; i++){
                int j, tmp = a[i];
                for(j=i-interval; j>=0 && a[j] > tmp; j -= interval){
                    a[j+interval] = a[j];
                }
                a[j+interval] = tmp;
            }
        }
    }
}
