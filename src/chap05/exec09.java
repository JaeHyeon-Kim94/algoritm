package chap05;

public class exec09 {
    static boolean[] flag_a = new boolean[8];   //특정 행에 퀸 배치 여부
    static boolean[] flag_b = new boolean[15];  //우상향 대각선 퀸 배치여부
                                                //i + j로 값을 구한다. 0(0+0) ~ 14(7+7) 총 15개
    static boolean[] flag_c = new boolean[15];  //우하향 대각선 퀸 배치여부
                                                //i열 j행이라고 할 때, 열이 높을수록 증가하며 행이 높을수록 감소함.
                                                //i - j + 7 (0열 7행부터 시작하여 0이므로 7을 더해준다)
    static int[] pos = new int[8];

    static void print(){
        for(int i=0; i<8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    static void setPos(int i){
        for(int j=0; j<8; j++){
            //우하향 우상향 대각선상 그리고 같은 행에 퀸이 배치되지 않은 경우를 설정한다.
            //즉, 해당사항이 있다면 퀸의 배치는 고려할 필요가 없으므로 실행하지 않는다.
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
