import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
Finding largest 3 elements of in an array
 */
public class FindingLargest3Elements {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 8, 1, 6, 9, 2};
        usingPriorityQueue(arr, arr.length, 3);
    }

    /*
    Time complexity - O(n * log n)
    Space complexity - O(n) - using queue
     */
    private static void usingPriorityQueue(Integer[] arr, int arrLen, int numerOfElementsToPrint) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(arr));
        for(int i = 0; i < numerOfElementsToPrint; i++)
            System.out.print(pq.remove() + " ");
    }
}
