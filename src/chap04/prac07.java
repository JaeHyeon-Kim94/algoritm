package chap04;

public class prac07<E> {
    private int rearA;
    private int frontA;
    private int rearB;
    private int frontB;
    private E[] que;
    private int max;
    private int num;

    enum Queue{
        QueueA, QueueB
    }

    static class OverflowQueException extends RuntimeException{

    }

    static class EmptyQueException extends RuntimeException{
    }

    public prac07(int capacity) {
        this.max = capacity;
        num = 0;
        rearA = frontA = 0;
        rearB = frontB = max-1;

        que = (E[])new Object[max];
    }

    public E enqueue(Queue k, E e){

        if(num >= max)  throw new OverflowQueException();

        switch(k){
            case QueueA :
                que[rearA++] = e;
                if(rearA >= max) rearA = 0;
                num++;
            case QueueB :
                que[rearB--] = e;
                if(rearB < 0) rearB = max-1;
                num++;
        }
        return e;
    }

    public E dequeue(Queue k){

        E e = null;
        switch(k){
            case QueueA:
                e = que[frontA++];
                if(frontA >= max-1) frontA = 0;
                num--;
            case QueueB :
                e = que[frontB--];
                if(frontB < 0) frontB = max-1;
                num--;
        }
        return e;
    }
}
