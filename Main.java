class SumThread extends Thread {
    private int start, end;
    private long sum = 0;

    // Constructor
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Run method (executed when thread starts)
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
    }

    // Getter method to return sum
    public long getSum() {
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two threads
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        // Start threads (parallel execution)
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get results from both threads
        long totalSum = t1.getSum() + t2.getSum();

        // Print final result
        System.out.println("Final Total Sum = " + totalSum);
    }
}