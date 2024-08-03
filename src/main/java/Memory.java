import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Memory {
    private final int maxItems;
    private List<Element> items;
    private float currentProbability;

    public Memory(int maxItems) {
        this.maxItems = maxItems;
        this.items = new ArrayList<>();
        this.currentProbability = 1f;
    }

    public int getApproximationOfAddedItems() {
        return Math.round(items.size() / currentProbability);
    }

    public void addElement(Element element) {
        if (Math.random() > currentProbability) {
            return;
        }
        if (items.size() + 1 == maxItems) {
            adjustProbability();
        }
        items.add(element);
    }

    private void adjustProbability() {
        currentProbability /= 2;
        items = items.stream()
                .filter(element -> Math.random() > 0.5f)
                .collect(Collectors.toList());
    }
}