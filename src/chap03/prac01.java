package chap03;

public class prac01 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 10, 15, 20, 25, 30, 0};
        int n = 7;
        int key = 30;

        System.out.println(seqSearchSen(arr, n, key));
    }


    static int seqSearchSen(int[] arr, int n, int key){
        arr[n] = key;
        int i=0;
        for( ; i<=n; i++){
            if(arr[i] == key) break;
        }
        return i == n ? -1 : i;
    }
}
