package chap01;

import java.util.Scanner;
//X
public class exec1C_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;


        do {
            System.out.print("두 자리의 정수를 입력하세요 : ");
            no = sc.nextInt();
        }while (no < 10 || no > 99);

        System.out.println("입력하신 두 자리 값 : " + no);
    }
}
