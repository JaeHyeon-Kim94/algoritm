package chap02;

import java.util.Arrays;
import java.util.Random;
//배열 복사
public class prac04 {
    public static void main(String[] args) {
        Random ran = new Random();
        int count = ran.nextInt(20);
        int[] baseArr = new int[count];
        for(int i=0; i<count; i++){
            baseArr[i] = ran.nextInt(100);
        }
        System.out.println("복사 base int arr : " + Arrays.toString(baseArr));
        int[] copiedArr = copy(baseArr, false);
        int[] reverseCopiedArr = copy(baseArr, true);
        System.out.println("복사된 int arr : " + Arrays.toString(copiedArr));
        System.out.println("역순 복사된 int arr : " + Arrays.toString(reverseCopiedArr));
    }

    static int[] copy(int[] baseArr, boolean reverse){
        int[] copiedArr = new int[baseArr.length];
        if(reverse){
            for(int i=0; i<baseArr.length; i++){
                copiedArr[baseArr.length-i-1] = baseArr[i];
            }
        }else {
            for (int i = 0; i < baseArr.length; i++) {
                copiedArr[i] = baseArr[i];
            }
        }
        return copiedArr;
    }
}
