public class Main {
    public static void main(String[] args) {
        LazyPrime lazyPrime = new LazyPrime();
        OptimizedPrime optimizedPrime = new OptimizedPrime();

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        thread2.start();
    }
}