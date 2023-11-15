package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexNames {

    private final List<String> names;

    public OddIndexNames(List<String> names) {
        this.names = names;
    }

    public void findAnOddIndex() {
        String result = IntStream.range(0, names.size())
                // Фільтр для непарних індексів
                .filter(index -> index % 2 != 1)
                // Формуємо рядок
                .mapToObj(index -> (index + 1) + ". " + names.get(index))
                // Формат виводу тексту (зараз виводяться в рядок)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}