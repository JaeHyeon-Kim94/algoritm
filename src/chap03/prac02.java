package chap03;
//TODO
public class prac02 {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 3, 2, 1, 9, 8};
        System.out.print("    |");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%4d", i);
        }

        System.out.print("\n----+");
        for(int i=0; i<arr.length*4; i++){
            System.out.print("-");
        }
        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.print("    |");
            //%% => %로 간주
            //따라서 %% + %d + s = %정수값+문자열
            System.out.printf(String.format("%%%ds*\n",(i*4)+3), "");
            System.out.printf("%4d|", i);
            for (int k=0; k<arr.length; k++){
                System.out.printf("%4d", arr[k]);
            }
            System.out.println("\n    |");
        }
    }
}
