package task5;

import java.util.stream.Stream;

public class ZipTests {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8, 9, 10, 11);

        ZipGenerate zips = new ZipGenerate(first, second);
        zips.print();
    }
}