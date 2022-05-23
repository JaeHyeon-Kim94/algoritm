package chap03;

public class prac04 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 6, 8, 9};
        int key = 9;
        int n= 7;

        int l = 0;
        int r = n-1;



        System.out.print("   |");
        for (int i=0; i<n; i++) System.out.printf("%4d", i);
        System.out.println();

        System.out.print("---+");
        for (int i=0; i<4*n; i++) System.out.print("-");
        System.out.println();

        do {
            int c = (l+r)/2;

                System.out.print("   |");
            if (l != c)
                System.out.printf(String.format("%%%ds<-%%%ds+",
                                (l * 3) + 1, (c - l) * 3),
                        "", "");
            else
                System.out.printf(String.format("%%%ds<-+",   c * 3 + 1), "");
            if (c != r)
                System.out.printf(String.format("%%%ds->\n",
                        (r - c) * 3 - 2), "");
            else
                System.out.println("->");

                System.out.printf("%3d|", c);

                for(int j=0; j<n; j++)
                    System.out.printf("%3d", a[j]);
                System.out.println();
                System.out.print("   |\n");



            if (a[c] == key){
                System.out.println(key + "는 a[" + c + "]에 있습니다.");
                return;
            }
            else if (a[c] < key) l = c + 1;
            else r = c-1;
        }while(l<=r);

        System.out.println("값 없음.");

    }
}

