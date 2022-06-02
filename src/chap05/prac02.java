package chap05;

public class prac02 {
    public static int gcd(int x, int y){
        if(x < y){
            int tmp = x;
            y = x;
            x = tmp;
        }
        while(true){
            if(x%y!=0){
                int tmp = y;
                y = x%y;
                x = tmp;
            }else{
                break;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(gcd(78696, 19332));
    }
}
