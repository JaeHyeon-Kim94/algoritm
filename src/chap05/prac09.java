package chap05;

public class prac09 {
    static boolean[] flag_a = new boolean[8];	// 각 행에 퀸이 이미 배치되어 있는가?
    static boolean[] flag_b = new boolean[15];	// ／대각선에 퀸이 이미 배치되어 있는가?
    static boolean[] flag_c = new boolean[15];	// ＼대각선에 퀸이 이미 배치되어 있는가?
    static int[] pos = new int[8]; // 각 열의 퀸의 위치

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
        int j;
        int[] jstk = new int[8];

        Start : while(true){
            j = 0;
            while(true){
                while(j<8){
                    if(!flag_a[j] && !flag_b[i+j] && !flag_c[i - j + 7]){
                        pos[i] = j;

                        if(i == 7) print();
                        else{
                            flag_a[j] = flag_b[i+j] = flag_c[i - j + 7] = true;
                            jstk[i++] = j;
                            continue Start;
                        }
                    }
                    j++;
                }
                if(--i == -1) return;
                j = jstk[i];
                flag_a[j] = flag_b[i+j] = flag_c[i - j + 7] = false;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        setPos(0);
    }
}
