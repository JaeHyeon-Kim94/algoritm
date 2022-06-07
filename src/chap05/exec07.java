package chap05;

public class exec07 {
    static int[] pos = new int[8];
    static int tmp = 0;

    static void print(){
        for(int i=0; i<8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println("\t "+ ++tmp);
    }

    static void setPos(int i){
        for(int j=0; j<8; j++){
            pos[i] = j;

            if(i == 7) print();
            else setPos(i+1);
        }
    }

    public static void main(String[] args) {
        setPos(0);
    }
}
