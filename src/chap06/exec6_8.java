package chap06;

public class exec6_8 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static void partition(int[] a, int n){
        int l = 0;
        int r = n-1;
        int pivot = a[n/2];

        do{
            while(a[l] < pivot) l++;
            while(a[r] > pivot) r--;
            if(l<=r) swap(a, l++, r--);
        }while(l<=r);

        System.out.println("피벗의 값 : " + pivot);

        System.out.println("피벗 이하의 그룹");
        for(int i=0; i<l; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        if(l>r+1){
            System.out.println("피벗과 일치하는 그룹");

            for(int i=r+1; i<l; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for(int i = r+1; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 7, 4, 5, 2, 6, 3, 9, 11};

        partition(a, 10);
    }
}
