package chap05;

public class prac05 {
    static void recur2_1(int n){
        int[] nstk = new int[100];
        int[] sstk = new int[100];
        int ptr = -1;
        int sw = 0;

        while(true){
            if(n>0){
                ptr++;
                nstk[ptr] = n;
                sstk[ptr] = sw;


                if(sw == 0){
                    n = n-1;
                }else if(sw == 1){
                    n = n-2;
                    sw = 0;
                }
                continue;
            }

          do{
              n = nstk[ptr];
              sw = sstk[ptr--]+1;

              if(sw == 2){
                  System.out.println(n);
                  if(ptr<0) return;
              }

          }while(sw == 2);
        }
    }

    static void recur3(int n){
        
    }

    public static void main(String[] args) {
        recur2_1(8);
    }
}
