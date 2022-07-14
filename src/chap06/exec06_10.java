package chap06;

import java.util.EmptyStackException;

public class exec06_10 {
    static void swap(int[] a, int idx1, int idx2){
        int tmp = a[idx2];
        a[idx2] = a[idx1];
        a[idx1] = tmp;
    }

    static void quickSort(int[] a, int left, int right)throws Exception{
        Stack lStk = new Stack(right - left + 1);
        Stack rStk = new Stack(right - left + 1);

        lStk.push(left);
        rStk.push(right);

        while(!lStk.isEmpty()){
            int l = left = (int)lStk.pop();
            int r = right = (int)rStk.pop();
            int pivot = a[(left + right)/2];

            do{
                while(a[l] < pivot) l++;
                while(a[r] > pivot) r--;
                if(l<=r) swap(a, l++, r--);
            }while(l<=r);

            if(r > left){
                lStk.push(left);
                rStk.push(r);
            }

            if(l < right){
                lStk.push(l);
                rStk.push(right);
            }
        }
    }

}
//스택
class Stack<E>{
    private int max;
    private int ptr;
    private E[] stk;

    public Stack(int capacity){
        ptr = 0;
        max = capacity;

        try{
            stk = (E[]) new Object[max];
        }catch(OutOfMemoryError e){
            max = 0;
            e.printStackTrace();
        }
    }

    public E push(E e) throws Exception{
        if(ptr >= max) throw new Exception();
        return stk[ptr++] = e;
    }

    public E pop() throws Exception{
        if(ptr < 0) throw new EmptyStackException();
        return stk[--ptr];
    }

    public E peek() throws Exception{
        if(ptr < 0) throw new EmptyStackException();
        return stk[ptr-1];
    }

    public int indexOf(E e){
        for(int i = ptr-1; i>=0; i--){
            if(stk[i].equals(e)) return i;
        }
        return -1;
    }
    public void clear(){ptr = 0;}
    public int size(){return ptr;}
    public boolean isEmpty(){return ptr<=0;}
    public boolean isFull(){return ptr>=max;}
}