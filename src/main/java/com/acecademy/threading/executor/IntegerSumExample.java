package com.acecademy.threading.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class IntegerSumExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        int start = 1;
        int end = 100;
        int step = 10;

        List<Callable<Integer>> tasks = new ArrayList<>();

        for (int i = 0; i < end / step; i++) {
            tasks.add(new IntSum(start, start + step));
            start += 10;
        }

        List<Future<Integer>> res = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            Future<Integer> future = service.submit(tasks.get(i));
            res.add(future);
        }
        long sum = 0;
        for (Future<Integer> r : res) {
            sum += r.get();
        }
        System.out.println(sum);
        service.shutdown();
    }
}


class IntSum implements Callable<Integer> {

    int start, end;

    public IntSum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }
}
