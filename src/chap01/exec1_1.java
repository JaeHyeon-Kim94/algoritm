package chap01;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class exec1_1 {
    public static void main(String[] args) throws InterruptedException {
        max3();
        TimeUnit.SECONDS.sleep(3);
        min4();
    }

    static void max3(){
        Scanner stdMax = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdMax.nextInt();
        System.out.println("b의 값 : "); int b = stdMax.nextInt();
        System.out.println("c의 값 : "); int c = stdMax.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("최댓값은 " + max + "입니다");
    }

    static void min4(){
        Scanner stdMin = new Scanner(System.in);

        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdMin.nextInt();
        System.out.println("b의 값 : "); int b = stdMin.nextInt();
        System.out.println("c의 값 : "); int c = stdMin.nextInt();
        System.out.println("d의 값 : "); int d = stdMin.nextInt();

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;
        System.out.println("최솟값은 " + min + "입니다.");
    }

}