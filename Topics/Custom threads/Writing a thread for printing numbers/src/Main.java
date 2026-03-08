import java.util.stream.IntStream;

class NumbersThread extends Thread {
    private final IntStream numbers;

    public NumbersThread(int from, int to) {
        numbers = IntStream.rangeClosed(from, to);
    }

    @Override
    public void run() {
        numbers.forEach(System.out::println);
    }
}