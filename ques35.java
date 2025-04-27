/* Find the k-most frequent elements in an array using a priority queue. Write its 
algorithm, program. Find its time and space complexities. Explain with suitable 
example. */

import java.util.*;

public class ques35 {
    
    public static ArrayList<Integer> topKFrequent(ArrayList<Integer> nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Min-heap: stores frequency and number pairs
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            minHeap.offer(new int[]{count, num});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll()[1]);
        }
        
        // Optional: reverse to get descending order by frequency
        Collections.reverse(result);
        
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3));
        int k = 2;
        ArrayList<Integer> topK = topKFrequent(nums, k);

        System.out.print("Top " + k + " frequent elements: ");
        for (int num : topK) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}