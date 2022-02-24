package Entities;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public abstract class Queue<T> {

    BlockingQueue<T> queue;

    public Queue(int size)
    {
        queue = new ArrayBlockingQueue<T>(size);
    }

    public boolean put(T item){
        boolean ans;
        try {
            queue.put(item);
            ans=true;
        }catch (InterruptedException e){
            ans=false;
        }
        return ans;
    }

    public T take(){
        T ans;
        try {
            ans = queue.take();
        }catch (InterruptedException e){
            ans = null;
        }
        return ans;
    }

}
