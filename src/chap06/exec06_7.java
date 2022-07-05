package chap06;

public class exec06_7 {
    static void shellSort_v2(int[] a, int n){
        int interval=1;
        for(; interval<n/9; interval=interval*3+1){}

        for(; interval>0; interval/=3){
            for(int start=interval; start<n; start++){
                int j, tmp = a[start];

                for(j=start-interval; j>=0 && a[j] > tmp; j--){
                    a[j+interval] = a[j];
                }
                a[j+interval] = tmp;
            }
        }
    }
}
