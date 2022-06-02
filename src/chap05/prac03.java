package chap05;

public class prac03 {
    static int gcd(int a, int b){
        if(a%b == 0) return b;
        else return gcd(b, a%b);
    }
    static int arrGcd(int[] arr, int start){
        if(start == arr.length) return arr[start-1];

        return gcd(arr[start], arrGcd(arr, start+1));
    }

    static int gcd1(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return (x);
    }

    // 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
    static int gcdArray1(int a[], int start, int no) {
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcd1(a[start], a[start + 1]);
        else
            return gcd1(a[start], gcdArray1(a, start + 1, no - 1));
    }

    public static void main(String[] args) {
        int[] arr = {1071, 1029, 420, 777, 333, 5};
        long a;
//답안 코드
//        a = System.nanoTime();
//        System.out.println(gcdArray1(arr, 0, arr.length));  //132700
//        System.out.println((System.nanoTime() - a));

//        System.out.println("=====================");
//내꺼
        a = System.nanoTime();
        System.out.println(arrGcd(arr, 0)); //134400
        System.out.println((System.nanoTime() - a));


    }
}
