package task1;

import java.util.List;

public class NamesTests {
    public static void main(String[] args) {
        //створювання списку імен
        OddIndexNames names = new OddIndexNames(List.of("Ivan", "John", "Peter", "Inna", "Artur", "Nataliya",
                "Anton", "Volodymyr", "Katya", "Olga", "Inna", "Anna", "Liana", "Sofiya"));
        //повертає непарний рядок, findAnOddIndex()
        names.findAnOddIndex();
    }
}