package w11.ie.atu.sw;
import java.time.Duration;

import static java.lang.System.*;
// External task!
public class ExternalTask implements Runnable{
    @Override
    public void run(){
        out.println(Thread.currentThread().getName() + " starting.");  // get current thread

        try {
            Thread.sleep(Duration.ofSeconds(2));    // go sleep for 2 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        out.println(Thread.currentThread().getName() + " ending.");
    }
}
