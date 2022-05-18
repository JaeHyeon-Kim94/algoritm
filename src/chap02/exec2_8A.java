package chap02;

//TODO 기수 변환-1
public class exec2_8A {
    public static void main(String[] args) {
        System.out.println("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".length());
    }

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while(x != 0);

        return digits;
    }
}
