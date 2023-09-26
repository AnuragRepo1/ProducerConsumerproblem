package producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class CommonResource {

    Queue<Integer>queue;
   int capacity;

    public CommonResource(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }
    synchronized public void produceItem(int n) throws InterruptedException {
        if(queue.size() == capacity){
            wait();
        }
        this.queue.add(n);
        System.out.println("produced element " + n);
        notify();
    }

    synchronized public void consumeItem() throws InterruptedException {
        if(queue.size() == 0){
            wait();
        }
        int n =this.queue.poll();
        System.out.println("consumed element " + n);
        notify();
    }
}
