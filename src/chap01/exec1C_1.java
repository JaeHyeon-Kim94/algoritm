package chap01;
//값 비교
public class exec1C_1 {
    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//
//        System.out.println("세 정수의 중앙값을 구합니다.");
//        System.out.println("a의 값 : "); int a = stdIn.nextInt();
//        System.out.println("b의 값 : "); int b = stdIn.nextInt();
//        System.out.println("c의 값 : "); int c = stdIn.nextInt();
//
//        System.out.println("중앙 값은 " + med3(a, b, c) + "입니다.");

        System.out.println("med3(3,2,1) = " + med3_1(3, 2, 1)); // a＞b＞c 2
        System.out.println("med3(3,2,2) = " + med3_1(3, 2, 2)); // a＞b＝c 2
        System.out.println("med3(3,1,2) = " + med3_1(3, 1, 2)); // a＞c＞b 2
        System.out.println("med3(3,2,3) = " + med3_1(3, 2, 3)); // a＝c＞b 3
        System.out.println("med3(2,1,3) = " + med3_1(2, 1, 3)); // c＞a＞b 2
        System.out.println("med3(3,3,2) = " + med3_1(3, 3, 2)); // a＝b＞c 3
        System.out.println("med3(3,3,3) = " + med3_1(3, 3, 3)); // a＝b＝c 3
        System.out.println("med3(2,2,3) = " + med3_1(2, 2, 3)); // c＞a＝b 2
        System.out.println("med3(2,3,1) = " + med3_1(2, 3, 1)); // b＞a＞c 2
        System.out.println("med3(2,3,2) = " + med3_1(2, 3, 2)); // b＞a＝c 2
        System.out.println("med3(1,3,2) = " + med3_1(1, 3, 2)); // b＞c＞a 2
        System.out.println("med3(2,3,3) = " + med3_1(2, 3, 3)); // b＝c＞a 3
        System.out.println("med3(1,2,3) = " + med3_1(1, 2, 3)); // c＞b＞a 2

    }


    static int med3(int a, int b, int c){
        if(a >= b)
            if(b >= c)
                return b;
            else if(a <= c)
                return a;
            else
                return c;
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }

    static int med3_1(int a, int b, int c){
        if(a>=b)
            if(a>b)
                if(b>=c)
                    if(b>c)
                        return b;
                    else//b=c
                        return b;
                else//c>b
                    if(a>=c)
                        if(a>c)
                            return c;
                        else//a=c
                            return c;
                    else//c>a && a>b
                        return a;
            else//a=b
                if(b>=c)
                    if(b>c)//a=b>c
                        return b;
                    else//a=b=c
                        return b;
                else//c>a=b
                    return b;
        else//a<b
            if(a>=c)
                if(a>c)
                    return a;
                else//b>a=c
                    return a;
            else//a<c
                if(b>=c)
                    if(b>c)
                        return c;
                    else
                        return c;
                else//b<c
                    return b;

    }
}

