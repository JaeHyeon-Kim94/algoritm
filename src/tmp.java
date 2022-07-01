import java.util.Arrays;

public class tmp {
    public static void swap(int[] a, int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    static void insertionSort(int[] a, int n){
        for(int i=0; i<n; i++){
            int tmp = a[i];
            int j;

            for(j = i; j>0 && a[j-1] > tmp; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    //보초법
    static void insertionSort_1(int[] a, int n){
        for(int i=2; i<n; i++){
            int tmp = a[0] = a[i];

            int j=i;

            while(a[j-1] > tmp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = tmp;
        }
    }

    //이진검색
    static void insertionSort_2(int[] a, int n){
        for(int i=1; i<n; i++){
            int l = 0;
            int r = i-1;
            int c, key = a[i];

            do{
                c = (l + r)/2;
                if(a[c] == key) break;
                else if(a[c] < key) l = c+1;
                else r = c-1;
            }while(l<=r);

            int idx = (l<=r) ? c+1 : r+1;

            for(int j = i; j >idx; j--){
                a[j] = a[j-1];
            }

            a[idx] = key;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 8, 3, 1, 9, 7};
        System.out.println(Arrays.toString(arr));
//        insertionSort_1(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
}
