package scratches;

/**
 * Volatile Test Showcase
 * Created by ivan on 17-5-11.
 **/
public class VolatileTest {

    private volatile boolean init = false;

    private VolatileTest() {

    }

    private void init() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        init = true;
    }

    private void doSomething() {
        if (!init) {
            //System.out.println("not init");
            throw new RuntimeException("not init");
        }
        System.out.println(Thread.currentThread().getName() + "=== working");
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest provider = new VolatileTest();

        Thread thread1 = new Thread("thread01") {
            public void run() {
                System.out.println("init start");
                provider.init();
                System.out.println("init finish");
            }
        };

        Thread thread2 = new Thread("thread02") {
            public void run() {
                System.out.println("start request");
                while (true) {
                    boolean succ = false;
                    try {
                        provider.doSomething();
                        succ = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (succ) break;
                }
                System.out.println("request finish");
            }
        };

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
