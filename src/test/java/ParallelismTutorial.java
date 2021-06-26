import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Job implements Runnable{
    private final List<String> data;
    private final Service service;
    public Job(List<String> data) {
        this.data = data;
        this.service = new Service();
    }
    @Override
    public void run() {
        for (String s : data)
            service.doWork(s);
    }
}

class Service{
    public void doWork(String s){
            System.out.printf("Do work on %s%n", s);
    }
}

public class ParallelismTutorial {

    @Test
    public void newWay(){
        Service service = new Service();
        getData().parallelStream().forEach(service::doWork);
    }

    @Test
    public void oldWay(){
        List<String> data = getData();
        for(List<String> batch : getDataChunks(data, 1000))
            new Job(batch).run();
    }

    private List<String> getData(){
        return IntStream.
                range(0, 10_000).
                mapToObj(Integer::toString).
                collect(Collectors.toList());
    }

    private List<List<String>> getDataChunks(List<String> data, int chunkSize){
        List<List<String>> result= new ArrayList<>();
        final AtomicInteger counter = new AtomicInteger();

        for (String s : data) {
            if (counter.getAndIncrement() % chunkSize == 0)
                result.add(new ArrayList<>());
            result.get(result.size() - 1).add(s);
        }
        return result;
    }

}
