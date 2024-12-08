package w11.ie.atu.sw;

import java.time.Duration;

import static java.lang.System.out;

public class Runner {
    public void go() throws InterruptedException {
        Thread t = new Thread(new ExternalTask(), "T1");

        // anom inner class (here i am using a lambda expression instead of using new Runnable() )
        Thread s = new Thread(() -> {
            out.println(Thread.currentThread().getName() + " starting.");  // get current thread

            try {
                Thread.sleep(Duration.ofSeconds(3));    // go sleep for 2 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            out.println(Thread.currentThread().getName() + " ending.");
        }, "T2");


        t.start();  // start the thread - need to give it ome jobs
        s.start();
        s.join();
        t.join();  // Blocks...!


        // But how many threads can we actually handle??
        // Depends on the amount of memory (i have 16 GB for context)
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(Duration.ofSeconds(5));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new Runner().go();
    }

    // inner class!
    private class Task implements Runnable {
        @Override
        public void run() {
            out.println(Thread.currentThread().getName() + " starting.");  // get current thread

            try {
                Thread.sleep(Duration.ofSeconds(2));    // go sleep for 2 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            out.println(Thread.currentThread().getName() + " ending.");
        }
    }

}
