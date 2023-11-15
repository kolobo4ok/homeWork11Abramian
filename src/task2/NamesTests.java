package task2;

import java.util.List;

public class NamesTests {
    public static void main(String[] args) {
        //створювання списку імен
        FiltersNames names = new FiltersNames(List.of("Ivan", "John", "Peter", "Inna", "Artur", "Nataliya",
                "Anton", "Volodymyr", "Katya", "Olga", "Inna", "Anna", "Liana", "Sofiya"));

        //повертає рядок у верхньому регістрі та відсортований за спаданням (Z-A)
        names.filtersName();
    }
}