package task4;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    private long seed;
    private long a;
    private long c;
    private long m;
    private int maxSize;

    public LinearCongruentialGenerator(long seed, long a, long c, long m, int maxSize) {
        this.seed = seed;
        this.a = a;
        this.c = c;
        this.m = m;
        this.maxSize = maxSize;
    }

    public void generate() {
        Stream<Long> randomStream = generateRandomStream(seed, a, c, m);
        randomStream
                //обмеежння кілкісь виводу
                .limit(maxSize)
                .forEach(System.out::println);
    }

    //Розрахунок по формулі
    private static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}