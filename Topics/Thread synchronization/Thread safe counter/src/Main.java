import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger(0);

    public void inc() {
        count.incrementAndGet();
    }
}


/*
class Counter {
    int count = 0;

    public synchronized void inc() {
        count++;
    }
}
*/
