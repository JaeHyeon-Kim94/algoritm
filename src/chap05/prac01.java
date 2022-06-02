package chap05;

public class prac01 {
    public static int factorial(int a){
        for(int i=a-1; i>0; i--){
            a*=i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
