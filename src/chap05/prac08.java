package chap05;

public class prac08 {
    static boolean[] flag_a = new boolean[8];
    static boolean[] flag_b = new boolean[15];
    static boolean[] flag_c = new boolean[15];

    static int[] pos = new int[8];
    static int count = 0;
    static void print(){
        System.out.println("================="+ ++count +"================");
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(pos[i] == j){
                    System.out.printf("%2c",'\u25A0');
                }else{
                    System.out.printf("%2c",'\u25A1');
                }
            }
            System.out.println();
        }

    }

    static void setPos(int i){
        for(int j=0; j<8; j++){
            if(!flag_a[j] && !flag_b[i+j] && !flag_c[i-j+7]){
                pos[i] = j;
                if(i == 7) print();
                else{
                    flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
                    setPos(i+1);
                    flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        setPos(0);
    }
}
