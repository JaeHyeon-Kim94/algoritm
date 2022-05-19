package chap02;

import java.util.Scanner;

public class exec2_13 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}        //평년
            , {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}      //윤년
    };

    static int isLeap(int year){
        //4년주기. 400으로 나누어 떨어지고 100으로는 나누어 떨어지지 않으면 윤년, 아니면 평년
        return (year%4==0 && year%100 != 0 || year%400 == 0 ) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d){
        int days = d;

        for(int i=1; i<m; i++){
            days += mdays[isLeap(y)][i-1];
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry = 0;
        System.out.println("그 해 경과 일수를 구합니다.");
        do{
            System.out.print("년 : "); int year  = sc.nextInt();
            System.out.print("월 : "); int month = sc.nextInt();
            System.out.print("일 : "); int day   = sc.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
            retry = sc.nextInt();
        }while(retry == 1);
    }

}
