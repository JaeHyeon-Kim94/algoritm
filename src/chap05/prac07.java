package chap05;

import java.util.Stack;

public class prac07 {
    public static void move(int n, int x, int y){
       int[] xstk = new int[50];
       int[] ystk = new int[50];
       int[] sstk = new int[50];
       int ptr = 0; //스택 포인터
       int sw = 0;

       while(true){
           if(sw==0 && n>1){
               xstk[ptr] = x;
               ystk[ptr] = y;
               sstk[ptr] = sw;
               ptr++;

               n -= 1;
               y = 6 - x - y;
               continue;
           }

           System.out.printf("%d 원반을 %d 기둥에서 %d 기둥으로 옮김.\n", n, x, y);

           if(sw==1 && n>1){
               xstk[ptr] = x;
               ystk[ptr] = y;
               sstk[ptr] = sw;
               ptr++;

               n -= 1;
               x = 6 - x - y;
               if(++sw == 2) sw = 0;
               continue;
           }

           do{
               if(ptr-- == 0) return;
               x = xstk[ptr];
               y = ystk[ptr];
               sw = sstk[ptr]+1;
               n++;
           }while(sw == 2);
       }
    }

    public static void main(String[] args) {
        move(3, 1, 3);
    }
}
