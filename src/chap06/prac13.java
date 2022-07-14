package chap06;

public class prac13 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static void quickSort(int[] a, int left, int right) throws Exception {
        Stack lStk = new Stack(right - left + 1);
        Stack rStk = new Stack(right - left + 1);

        lStk.push(left);
        rStk.push(right);

        while(!lStk.isEmpty()){
            int l = left = (int) lStk.pop();
            int r= right = (int) rStk.pop();
            if(r-l < 9){
                insertionSort(a, l, r);
            }else{
                int pivot = a[(l + r)/2];

                do{
                    while(a[l] < pivot) l++;
                    while(a[r] > pivot) r--;
                    if(l<=r) swap(a, l++, r--);
                }while(l<=r);

                //l과 left, r과 right를 바꿔준다. 이러면 push하는 로직을 하나로 해결할 수 있음.
                if((right - l) < (r - left)){
                    int tmp;
                    tmp = r;
                    r = right;
                    right = tmp;

                    tmp = left;
                    left = l;
                    l = tmp;
                }

                if(l < right){
                    lStk.push(l);
                    rStk.push(right);
                }

                if(r > left){
                    lStk.push(left);
                    rStk.push(r);
                }
            }
        }
    }

    static void insertionSort(int[] a, int left, int right){
        for(int i=left+1; i<=right; i++){
            int j;
            int key = a[i];
            for(j = i; j>left && a[j-1] > key; j--){
                a[j] = a[j-1];
            }
            a[j] = key;
        }
    }
}
