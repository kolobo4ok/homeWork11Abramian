package task5;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ZipGenerate {
    private Stream<Integer> first;
    private Stream<Integer> second;

    public ZipGenerate(Stream<Integer> first, Stream<Integer> second) {
        this.first = first;
        this.second = second;

    }

    //вивід у консоль
    public void print() {
        Stream<Integer> result = zip(first, second);
        result.forEach(System.out::println);
    }

    private static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        Iterator<T> zippingIterator = new Iterator<T>() {
            private boolean toggle = true;

            @Override
            public boolean hasNext() {
                return toggle ? iterator1.hasNext() : iterator2.hasNext();
            }

            @Override
            public T next() {
                T value = toggle ? iterator1.next() : iterator2.next();
                toggle = !toggle;
                return value;
            }
        };

        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(zippingIterator, 0),
                false
        );
    }
}