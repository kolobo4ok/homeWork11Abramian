package task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersNames {
    private final List<String> inputlist;
    public FiltersNames(List<String> inputlist) {
        this.inputlist = inputlist;
    }

    public void filtersName() {
        List<String> result = inputlist.stream()
                //Переведення списку у верхній регістр
                .map(String::toUpperCase)
                //сортування за спаданням (Z-A)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}