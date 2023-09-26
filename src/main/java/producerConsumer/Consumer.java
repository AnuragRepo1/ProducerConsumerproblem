package producerConsumer;

public class Consumer extends Thread {
    CommonResource  commonResource;
    public Consumer(CommonResource commonResource) {
        this.commonResource = commonResource;
    }
    public void run() {
        while(true) {
            try {
                this.commonResource.consumeItem();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
