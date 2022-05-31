package chap04;

public class prac01 {
    class IntStack{
        private int max;    //스택 용량
        private int ptr;    //스택 포인터
        private int[] stk;  //스택 본체

        public IntStack(int capacity) {
            ptr = 0;
            max = capacity;
            try{
                stk = new int[max];
            }catch (OutOfMemoryError e){
                max = 0;
            }
        }
        //push 메서드
        public int push(int x){
            if(ptr >= max) throw new OverflowIntStackException();
            return stk[ptr++] = x;
        }
        //pop 메서드
        public int pop(){
            if(ptr <= 0) throw new EmptyIntStackException();
            return stk[--ptr];
        }
        //peek 메서드
        public int peek(){
            if(ptr <=0 ) throw new EmptyIntStackException();
            return stk[ptr - 1];
        }
        //indexOf 메서드 (top to bottom 선형 검색 수행)
        public int indexOf(int x){
            for(int i=0; i<ptr; i++){
                if(stk[i] == x) return i;
            }
            return -1;
        }
        //clear 메서드
        //스택의 모든 작업들은 스택 포인터(ptr)을 이용하여 이루어지기 때문에,
        //스택의 요솟값을 변경할 필요가 없다.
        public void clear(){ ptr = 0; }
        //capacity 메서드
        public int capacity(){ return max; }
        //size 메서드
        public int size(){ return ptr-1; }
        //IsEmpty 메서드
        public boolean IsEmpty(){ return ptr <= 0; }
        //IsFull 메서드
        public boolean IsFull(){ return ptr >= max; }
        //dump 메서드 (스택의 모든 데이터 표시)
        public void dump(){
            if(ptr <= 0) System.out.println("스택이 비어있음.");
            else{
                for(int i=0; i<ptr; i++){
                    System.out.println(stk[i] + " ");
                }
                System.out.println();
            }
        }


    }

    class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException() {
        }
    }

    class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException() {
        }
    }


}
