import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class NthLargestElement {
    public static int findNthLargest(int[] arr, int n) {
        if (arr.length < n) return -1;

        Set<Integer> uniqueSet = new TreeSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(uniqueSet);
        return arrayList.size() >= n ? arrayList.get(arrayList.size() - n) : -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99};
        int n = 2; // Find 2nd largest
        System.out.println(findNthLargest(arr, n)); // Output: 45
    }
}
