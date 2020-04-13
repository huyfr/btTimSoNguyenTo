public class OptimizedPrime implements Runnable {
    private boolean primeNumberCheck(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        boolean primeNumber;
        for (int i = 2; i < 200; i++) {
            primeNumber = primeNumberCheck(i);
            if (primeNumber) {
                System.out.println(i + "\t");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Optimized prime execution time: " + (endTime - startTime) + " milliseconds"+"\n-------------");
    }
}