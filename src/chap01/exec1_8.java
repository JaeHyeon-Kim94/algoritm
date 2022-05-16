package chap01;

import java.util.Scanner;

public class exec1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("별찍기 시작");

        do{
            System.out.print("몇 단?");
            n = sc.nextInt();
        }while (n <= 0);


        getNumerPira(n);
    }

    private static void getRightAngledTriangle_LeftBottom(int n) {
        for (int i = 1; i<= n; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void getRightAngledTriangle_RightBottom(int n){
        for(int i =0; i< n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(' ');
            }

            for(int k=n-i-1; k<n; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void getRightAngledTriangle_LeftTop(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void getRightAngledTriangle_RightTop(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i; j<n; j++){
                System.out.print(' ');
            }
            for(int k=0; k<(n-i); k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void geteQuilateralTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<(n-i)-1; j++){
                System.out.print(' ');
            }

            for(int k=0; k<2*(i)+1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void getNumerPira(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(' ');
            }

            for(int k=1; k<=2*(i-1)+1; k++){
                System.out.print(i%10);
            }
            System.out.println();
        }
    }
}
