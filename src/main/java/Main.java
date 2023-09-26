import producerConsumer.CommonResource;
import producerConsumer.Consumer;
import producerConsumer.Producer;

public class Main {
    public static void main(String[] args) {
        CommonResource resource = new CommonResource(5);
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
    }
}

