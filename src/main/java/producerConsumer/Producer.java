package producerConsumer;

public class Producer extends Thread {
    CommonResource  commonResource;
    public Producer(CommonResource commonResource) {
        this.commonResource = commonResource;
    }
    public void run() {
        int i = 1;
        while(true) {
            try {
                this.commonResource.produceItem(i);
                i++;
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
