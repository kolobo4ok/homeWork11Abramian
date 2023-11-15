package task4;

public class TaskTests {
    public static void main(String[] args) {
        LinearCongruentialGenerator generator = new LinearCongruentialGenerator(42, 25214903917L, 11, (long) Math.pow(2, 48), 15);
        generator.generate();
    }
}
