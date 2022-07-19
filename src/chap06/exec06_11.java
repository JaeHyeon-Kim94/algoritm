package chap06;

public class exec06_11 {
    static void merge(int[] a, int na, int[] b, int nb, int[] c){
        int aIdx = 0;
        int bIdx = 0;
        int cIdx = 0;

        while(aIdx < na && bIdx < nb)
            c[cIdx++] = (a[aIdx] <= b[bIdx]) ? a[aIdx++] : b[bIdx++];
        while(aIdx < na) c[cIdx++] = a[aIdx++];
        while(bIdx < nb) c[cIdx++] = b[bIdx++];
    }
}
