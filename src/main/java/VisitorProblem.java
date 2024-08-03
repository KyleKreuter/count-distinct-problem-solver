import java.util.ArrayList;
import java.util.List;

public class VisitorProblem {
    private final static int TEST_ELEMENTS = 1_000_000;
    private final static int TEST_CASES = 400;
    private final static int MEMORY_SIZE = 100_000;

    public static void main(String[] args) {
        List<Integer> deviation = new ArrayList<>();
        for (int testCases = 0; testCases < TEST_CASES; testCases++) {
            Memory memory = new Memory(MEMORY_SIZE);
            for (int i = 1; i < TEST_ELEMENTS; i++) {
                memory.addElement(new Element() {
                });
            }
            deviation.add(Math.abs(TEST_ELEMENTS - memory.getApproximationOfAddedItems()));
        }
        int absDeviation = deviation.stream().mapToInt(Integer::intValue).sum();
        double totalDeviation = (double) absDeviation / TEST_ELEMENTS;

        System.out.printf("Deviation: %.3f%%", totalDeviation);
    }
}