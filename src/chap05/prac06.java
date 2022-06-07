package chap05;

public class prac06 {

    public static String[] names = {"A기둥", "B기둥", "C기둥"};
    public static void move(int n, int x, int y){
        if(n > 1)
            move(n-1, x, 6-x-y);

        System.out.println(n+"번째 원반을 ["+names[x-1]+"]에서 ["+names[y-1]+"]로 옮깁니다.");
        if(n > 1)
            move(n-1, 6-x-y, y);
    }
    /*
        (3, 1, 3)
        (2, 1, 2)   print(3, 1, 3)  (2, 2, 3)
        (1, 1, 3)   print(2, 1, 2)  (1, 3, 2)   print(1, 3, 2)
                    print(1, 1, 3)
    */
    public static void main(String[] args) {
        move(3, 1, 3);
    }
}
