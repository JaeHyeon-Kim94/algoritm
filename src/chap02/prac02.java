package chap02;

import java.util.Arrays;
import java.util.Random;
//역순 변환
public class prac02 {
    public static void main(String[] args) {
        Random random = new Random();
        int idx = random.nextInt(15);
        int[] arr = new int[idx];

        for(int i=0; i<idx; i++){
            arr[i] = random.nextInt(100);
        }

        System.out.println("idx : " + idx);
        System.out.println("arr : " + Arrays.toString(arr));

        for(int i=0; i<idx/2; i++){
            System.out.println("a["+i+"]와 a["+(idx-i-1)+"]를 교환합니다.");
            reverse(arr, i, idx-i-1);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static void reverse(int[] arr, int frontIdx, int behindIdx){
        int tmp = arr[frontIdx];
        arr[frontIdx] = arr[behindIdx];
        arr[behindIdx] = tmp;
    }
}
