package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorted {
    private final String[] inputArray;

    public Sorted(String[] inputArray) {
        this.inputArray = inputArray;
    }

    public void sorted() {
        String result = Arrays.stream(inputArray)
                //розділяємо через символ ','
                .flatMap(s -> Arrays.stream(s.split(", ")))
                //перетворюємо в число
                .map(Integer::parseInt)
                //видаляємо дублікати
                .distinct()
                //сортування
                .sorted()
                //вивід
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}