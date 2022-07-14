import java.util.Arrays;

public class test{

    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static void bubbleSort(int[] a, int n){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]) swap(a, j, j+1);
            }
        }
    }

    static void bubbleSort_v1(int[] a, int n){
        for(int i=n-1; i>0; i--){
            int swapCount = 0;
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                    swapCount++;
                }
            }
            if(swapCount==0) break;
        }
    }

    static void bubbleSort_v2(int[] a, int n){
        for(int i=n-1; i>0; i--){
            int last = i;
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                    last = j;
                }
            }
            i = last;
        }
    }

    static void bubbleSort_v2_1(int[] a, int n){
        int k=n-1;
        while(k>0){
            int last = 0;
            for(int i=0; i<k; i++){
                if(a[i] > a[i+1]){
                    swap(a, i, i+1);
                    last = i;
                }
            }
            k = last;
        }
    }

    static void selectionSort(int[]a, int n){
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j= i+1; j<n; j++){
                if(a[j] < a[min]) min = j;
            }
            swap(a, min, i);
        }
    }

    static void insertionSort(int[] a, int n){
        
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 22, 11, 32, 120, 68, 70};
        System.out.println(Arrays.toString(a));
        bubbleSort_v2_1(a, 7);
        System.out.println(Arrays.toString(a));
    }
}


