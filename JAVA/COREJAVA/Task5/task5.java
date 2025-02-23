package core2;
import java.util.ArrayList;
import java.util.List;

class PrimeSumCalculator implements Runnable {
    private int start, end;
    private long sum = 0;

    public PrimeSumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class MultiThreadedPrimeSum {
    public static void main(String[] args) {
        int limit = 1000000; 
        int numThreads = 4;

        List<Thread> threads = new ArrayList<>();
        List<PrimeSumCalculator> tasks = new ArrayList<>();
        int range = limit / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * range + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * range;
            PrimeSumCalculator task = new PrimeSumCalculator(start, end);
            tasks.add(task);
            Thread thread = new Thread(task);
            threads.add(thread);
            thread.start();
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads.get(i).join();
                totalSum += tasks.get(i).getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}
