package chap03;

public class prac05 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
        int n = 12;
        int key = 7;
        int c = binSearchX(a, n, key);
        System.out.println("c : " + c);
    }

    static int binSearchX(int[] a, int n, int key){
        int l = 0;
        int r = n-1;
        do{
            int c = (l*r)/2;

            if(a[c] == key){
                while(true){
                    if(a[--c] == key && c > l)
                        continue;
                    else
                        return c+1;
                }
            }else if(a[c] < key){
                l = c+1;
            }else{
                r = c-1;
            }
        }while(l<=r);

        return -1;
    }
}
