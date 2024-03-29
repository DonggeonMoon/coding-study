package sort.bubble;

import sort.Sort;

public class BubbleSort extends Sort {
    private BubbleSort() {
    }

    public static BubbleSort create() {
        return new BubbleSort();
    }

    @Override
    public void sort(final int[] numbers) {
        int length = numbers.length;

        while (true) {
            boolean swapped = false;
            for (int i = 0; i < length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
