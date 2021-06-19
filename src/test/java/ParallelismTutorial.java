import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Job implements Runnable{
    @Override
    public void run() {
        System.out.println("do work!!!!");
    }
}

public class ParallelismTutorial {
    @Test
    public void oldWay(){
        Job job = new Job();
        List<Thread> threads = Arrays.asList(new Thread(job), new Thread(job), new Thread(job), new Thread(job));
        for (Thread thread : threads){
            thread.start();
        }
    }




}
