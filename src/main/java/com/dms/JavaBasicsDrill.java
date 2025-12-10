package com.dms;

import java.util.*;

/**
 * Java Data Structures - Standard Setup & Traversal
 * Practice file for memorizing basic syntax
 */
public class JavaBasicsDrill {

    public static void main(String[] args) {

        // ============================================================
        // ARRAYS
        // ============================================================
        
        // Declaration + initialization (inline)
        int[] nums = {1, 2, 3, 4, 5};
        String[] words = {"hello", "world", "!"};
        
        // Declaration + initialization (separate)
        double[] prices = new double[3];
        prices[0] = 9.99;
        prices[1] = 19.99;
        prices[2] = 29.99;

        // Traversal - standard for loop
        System.out.println("=== Array (standard for) ===");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + ": " + nums[i]);
        }

        // Traversal - enhanced for loop
        System.out.println("\n=== Array (enhanced for) ===");
        for (int n : nums) {
            System.out.println(n);
        }

        // ============================================================
        // ARRAYLIST
        // ============================================================
        
        ArrayList<String> names = new ArrayList<>();
        
        // Adding elements
        names.add("Alice");           // add to end
        names.add("Bob");
        names.add(0, "Zara");         // insert at index 0
        
        // Modifying elements
        names.set(1, "Charlie");      // replace element at index 1
        
        // Removing elements
        names.remove("Bob");          // remove by value
        names.remove(0);              // remove by index
        
        // Accessing elements
        String first = names.get(0);
        int size = names.size();
        boolean hasAlice = names.contains("Alice");
        int aliceIndex = names.indexOf("Alice");  // -1 if not found
        boolean empty = names.isEmpty();

        // Traversal
        System.out.println("\n=== ArrayList ===");
        for (String name : names) {
            System.out.println(name);
        }

        // Traversal with index
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        // ============================================================
        // HASHMAP
        // ============================================================
        
        HashMap<String, Integer> ages = new HashMap<>();
        
        // Adding entries
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        
        // Accessing values
        int aliceAge = ages.get("Alice");                    // returns null if key not found
        int unknownAge = ages.getOrDefault("Eve", 0);        // returns default if not found
        
        // Checking existence
        boolean hasKey = ages.containsKey("Bob");
        boolean hasValue = ages.containsValue(25);
        
        // Modifying
        ages.put("Alice", 31);        // overwrites existing value
        ages.remove("Bob");           // remove entry by key
        
        // Size
        int mapSize = ages.size();

        // Traversal - keys only
        System.out.println("\n=== HashMap (keys) ===");
        for (String key : ages.keySet()) {
            System.out.println(key + " -> " + ages.get(key));
        }

        // Traversal - entries (more efficient)
        System.out.println("\n=== HashMap (entries) ===");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Traversal - values only
        System.out.println("\n=== HashMap (values only) ===");
        for (int age : ages.values()) {
            System.out.println(age);
        }

        // ============================================================
        // HASHSET
        // ============================================================
        
        HashSet<Integer> uniqueNums = new HashSet<>();
        
        // Adding elements
        uniqueNums.add(10);
        uniqueNums.add(20);
        uniqueNums.add(30);
        uniqueNums.add(10);           // duplicate - ignored!
        
        // Checking existence
        boolean has10 = uniqueNums.contains(10);
        
        // Removing
        uniqueNums.remove(20);
        
        // Size
        int setSize = uniqueNums.size();

        // Traversal
        System.out.println("\n=== HashSet ===");
        for (int n : uniqueNums) {
            System.out.println(n);
        }

        // ============================================================
        // LINKEDLIST (as Deque - double-ended queue)
        // ============================================================
        
        LinkedList<String> deque = new LinkedList<>();
        
        // Adding at both ends
        deque.addFirst("first");
        deque.addLast("last");
        deque.addFirst("new first");
        deque.addLast("new last");
        
        // Accessing without removing
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();
        
        // Removing from both ends
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();

        // Traversal
        System.out.println("\n=== LinkedList ===");
        for (String s : deque) {
            System.out.println(s);
        }

        // ============================================================
        // STACK
        // ============================================================
        
        Stack<Integer> stack = new Stack<>();
        
        // Push elements (LIFO - Last In First Out)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Peek (look at top without removing)
        int top = stack.peek();
        
        // Pop (remove and return top)
        int popped = stack.pop();
        
        // Check if empty
        boolean stackEmpty = stack.isEmpty();
        
        // Search (returns 1-based position from top, -1 if not found)
        int position = stack.search(1);

        // Traversal (note: iterates from bottom to top)
        System.out.println("\n=== Stack ===");
        for (int n : stack) {
            System.out.println(n);
        }
        
        // Pop all (proper stack order - top to bottom)
        System.out.println("\n=== Stack (pop order) ===");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // ============================================================
        // QUEUE (via LinkedList)
        // ============================================================
        
        Queue<String> queue = new LinkedList<>();
        
        // Add to back (FIFO - First In First Out)
        queue.offer("first");         // offer is safer than add (doesn't throw)
        queue.offer("second");
        queue.offer("third");
        
        // Peek (look at front without removing)
        String front = queue.peek();
        
        // Poll (remove and return front)
        String polled = queue.poll();
        
        // Check if empty
        boolean queueEmpty = queue.isEmpty();
        
        // Size
        int queueSize = queue.size();

        // Traversal
        System.out.println("\n=== Queue ===");
        for (String s : queue) {
            System.out.println(s);
        }
        
        // Process all (proper queue order)
        System.out.println("\n=== Queue (poll order) ===");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // ============================================================
        // PRIORITYQUEUE (Min-Heap by default)
        // ============================================================
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add elements
        minHeap.offer(5);
        minHeap.offer(1);
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(4);
        
        // Peek (smallest element)
        int smallest = minHeap.peek();
        
        // Poll (remove smallest)
        int pollSmallest = minHeap.poll();

        // Process all in priority order
        System.out.println("\n=== PriorityQueue (min-heap) ===");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        // Max-Heap (using reverse comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(5);
        maxHeap.offer(1);
        maxHeap.offer(3);
        
        System.out.println("\n=== PriorityQueue (max-heap) ===");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }

        // ============================================================
        // TREEMAP (Sorted Map)
        // ============================================================
        
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        
        sortedMap.put("banana", 2);
        sortedMap.put("apple", 5);
        sortedMap.put("cherry", 3);
        
        // Navigation methods
        String firstKey = sortedMap.firstKey();
        String lastKey = sortedMap.lastKey();
        String lowerKey = sortedMap.lowerKey("banana");   // strictly less than
        String higherKey = sortedMap.higherKey("banana"); // strictly greater than

        // Traversal (sorted by key)
        System.out.println("\n=== TreeMap (sorted) ===");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // ============================================================
        // TREESET (Sorted Set)
        // ============================================================
        
        TreeSet<Integer> sortedSet = new TreeSet<>();
        
        sortedSet.add(30);
        sortedSet.add(10);
        sortedSet.add(20);
        
        // Navigation methods
        int firstNum = sortedSet.first();
        int lastNum = sortedSet.last();
        Integer lower = sortedSet.lower(20);    // strictly less than
        Integer higher = sortedSet.higher(20);  // strictly greater than

        // Traversal (sorted)
        System.out.println("\n=== TreeSet (sorted) ===");
        for (int n : sortedSet) {
            System.out.println(n);
        }

        System.out.println("\n=== Done! ===");
    }
}
