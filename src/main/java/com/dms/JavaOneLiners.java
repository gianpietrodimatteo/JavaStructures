package com.dms;

import java.util.*;

/**
 * Java Data Structures - One-Liner Initializations, Conversions & Matrices
 * Practice file for memorizing concise syntax patterns
 */
public class JavaOneLiners {

    public static void main(String[] args) {

        // ============================================================
        // ARRAY ONE-LINERS
        // ============================================================
        
        int[] nums = {1, 2, 3, 4, 5};
        String[] words = {"hello", "world"};
        double[] doubles = {1.1, 2.2, 3.3};
        
        // Inline with explicit new (useful when passing to methods)
        processArray(new int[]{10, 20, 30});
        
        // Empty with size
        int[] empty = new int[5];  // all zeros
        String[] nulls = new String[3];  // all null

        // ============================================================
        // LIST ONE-LINERS
        // ============================================================
        
        // --- FIXED-SIZE (can modify elements, but can't add/remove) ---
        List<String> fixed = Arrays.asList("a", "b", "c");
        // fixed.add("d");     // throws UnsupportedOperationException!
        // fixed.remove(0);    // throws UnsupportedOperationException!
        fixed.set(0, "z");     // OK - can modify elements

        // --- IMMUTABLE (Java 9+) - can't modify at all ---
        List<String> immutable = List.of("x", "y", "z");
        // immutable.set(0, "a");  // throws UnsupportedOperationException!
        // immutable.add("w");     // throws UnsupportedOperationException!

        // --- MUTABLE - the ones you'll use most often ---
        List<String> mutable1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<Integer> mutable2 = new ArrayList<>(List.of(1, 2, 3));
        
        // Now you can do anything
        mutable1.add("d");
        mutable1.remove(0);
        mutable1.set(0, "z");

        // ============================================================
        // SET ONE-LINERS
        // ============================================================
        
        // --- IMMUTABLE (Java 9+) ---
        Set<String> immutableSet = Set.of("red", "green", "blue");
        
        // --- MUTABLE ---
        Set<Integer> mutableSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 3, 3));  // duplicates removed
        Set<String> mutableSet2 = new HashSet<>(List.of("a", "b", "c"));
        
        // Sorted mutable set
        Set<Integer> sortedSet = new TreeSet<>(List.of(30, 10, 20));  // becomes {10, 20, 30}

        // ============================================================
        // MAP ONE-LINERS
        // ============================================================
        
        // --- IMMUTABLE (Java 9+) - alternating key, value, key, value ---
        Map<String, Integer> immutableMap = Map.of(
            "Alice", 30,
            "Bob", 25,
            "Charlie", 35
        );

        // --- For more than 10 entries, use Map.ofEntries ---
        Map<String, Integer> bigMap = Map.ofEntries(
            Map.entry("Alice", 30),
            Map.entry("Bob", 25),
            Map.entry("Charlie", 35),
            Map.entry("Diana", 28)
        );

        // --- MUTABLE ---
        Map<String, Integer> mutableMap = new HashMap<>(Map.of("a", 1, "b", 2));
        
        // Sorted mutable map
        Map<String, Integer> sortedMap = new TreeMap<>(Map.of("banana", 2, "apple", 1));

        // ============================================================
        // QUEUE / DEQUE / STACK ONE-LINERS
        // ============================================================
        
        Queue<String> queue = new LinkedList<>(List.of("first", "second", "third"));
        
        Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));
        
        // Stack with double-brace initialization (creates anonymous subclass - use sparingly)
        Stack<Integer> stack = new Stack<>() {{ 
            push(1); 
            push(2); 
            push(3); 
        }};
        
        // Better alternative for stack-like behavior
        Deque<Integer> stackAlt = new ArrayDeque<>(List.of(1, 2, 3));

        // PriorityQueue (min-heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(List.of(5, 1, 3, 2, 4));
        
        // PriorityQueue (max-heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(List.of(5, 1, 3, 2, 4));

        // ============================================================
        // CONVERTING BETWEEN STRUCTURES
        // ============================================================
        
        List<String> originalList = new ArrayList<>(List.of("a", "b", "a", "c", "b"));

        // --- List -> Set (removes duplicates) ---
        Set<String> fromList = new HashSet<>(originalList);

        // --- Set -> List ---
        List<String> fromSet = new ArrayList<>(fromList);

        // --- Map -> Set of keys ---
        Set<String> keys = mutableMap.keySet();
        Set<String> keysCopy = new HashSet<>(mutableMap.keySet());  // independent copy

        // --- Map -> Collection of values ---
        Collection<Integer> values = mutableMap.values();
        List<Integer> valuesList = new ArrayList<>(mutableMap.values());

        // --- Map -> List of entries ---
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(mutableMap.entrySet());

        // --- Array -> List ---
        String[] arr = {"x", "y", "z"};
        List<String> fromArray = new ArrayList<>(Arrays.asList(arr));

        // --- List -> Array ---
        String[] backToArray = fromArray.toArray(new String[0]);
        
        // --- Primitive array -> List (requires boxing) ---
        int[] primitiveArr = {1, 2, 3};
        List<Integer> fromPrimitive = Arrays.stream(primitiveArr).boxed().toList();  // immutable
        List<Integer> fromPrimitiveMutable = new ArrayList<>(Arrays.stream(primitiveArr).boxed().toList());
        
        // --- List -> primitive array ---
        List<Integer> intList = List.of(1, 2, 3);
        int[] toPrimitive = intList.stream().mapToInt(Integer::intValue).toArray();

        // ============================================================
        // COMBINING COLLECTIONS
        // ============================================================
        
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);

        // --- Combine Lists (modifies list1) ---
        list1.addAll(list2);  // list1 is now [1, 2, 3, 4, 5, 6]

        // --- Combine into new List ---
        List<Integer> combined = new ArrayList<>();
        combined.addAll(List.of(1, 2, 3));
        combined.addAll(List.of(4, 5, 6));
        combined.addAll(List.of(7, 8, 9));

        // --- Combine Sets (union) ---
        Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> setB = Set.of(3, 4, 5);
        setA.addAll(setB);  // setA is now {1, 2, 3, 4, 5}

        // --- Set intersection ---
        Set<Integer> setC = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> setD = Set.of(2, 3, 4);
        setC.retainAll(setD);  // setC is now {2, 3}

        // --- Set difference ---
        Set<Integer> setE = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> setF = Set.of(2, 3, 4);
        setE.removeAll(setF);  // setE is now {1}

        // --- Combine Maps ---
        Map<String, Integer> map1 = new HashMap<>(Map.of("a", 1, "b", 2));
        Map<String, Integer> map2 = Map.of("c", 3, "d", 4);
        map1.putAll(map2);  // map1 now has all entries

        // ============================================================
        // MATRICES (2D ARRAYS)
        // ============================================================

        // --- Inline initialization ---
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // --- Empty matrix with dimensions ---
        int[][] grid = new int[3][4];  // 3 rows, 4 columns (initialized to 0)
        boolean[][] visited = new boolean[5][5];  // all false
        String[][] strMatrix = new String[2][3];  // all null

        // --- Jagged array (rows of different lengths) ---
        int[][] jagged = {
            {1},
            {2, 3},
            {4, 5, 6}
        };

        // --- Access elements ---
        int center = matrix[1][1];  // 5 (row 1, col 1)
        matrix[0][0] = 99;          // modify

        // --- Dimensions ---
        int rows = matrix.length;          // 3
        int cols = matrix[0].length;       // 3

        // --- Traversal - standard (with indices) ---
        System.out.println("=== Matrix (standard) ===");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // --- Traversal - enhanced (without indices) ---
        System.out.println("\n=== Matrix (enhanced) ===");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // --- Fill entire matrix ---
        int[][] filled = new int[3][3];
        for (int[] row : filled) {
            Arrays.fill(row, 5);  // fill each row with 5s
        }

        // ============================================================
        // 2D ARRAYLIST (List of Lists) - Dynamic size
        // ============================================================

        // --- Initialize with values ---
        List<List<Integer>> matrix2D = new ArrayList<>(List.of(
            new ArrayList<>(List.of(1, 2, 3)),
            new ArrayList<>(List.of(4, 5, 6)),
            new ArrayList<>(List.of(7, 8, 9))
        ));

        // --- Initialize empty then build ---
        List<List<Integer>> dynamic2D = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            dynamic2D.add(new ArrayList<>());
        }
        // Now add to specific rows
        dynamic2D.get(0).add(1);
        dynamic2D.get(0).add(2);
        dynamic2D.get(1).add(3);

        // --- Access elements ---
        int val = matrix2D.get(1).get(2);  // row 1, col 2 -> 6

        // --- Modify ---
        matrix2D.get(0).set(0, 99);        // change element
        matrix2D.get(0).add(100);          // add to row

        // --- Dimensions ---
        int numRows = matrix2D.size();
        int numCols = matrix2D.get(0).size();

        // --- Traversal ---
        System.out.println("\n=== 2D ArrayList ===");
        for (List<Integer> row : matrix2D) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        // --- Traversal with indices ---
        System.out.println("\n=== 2D ArrayList (with indices) ===");
        for (int i = 0; i < matrix2D.size(); i++) {
            for (int j = 0; j < matrix2D.get(i).size(); j++) {
                System.out.print("(" + i + "," + j + ")=" + matrix2D.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // ============================================================
        // USEFUL PATTERNS
        // ============================================================

        // --- Initialize list with n copies ---
        List<Integer> fiveZeros = new ArrayList<>(Collections.nCopies(5, 0));

        // --- Initialize 2D list with default values ---
        int n = 3, m = 4;
        List<List<Integer>> grid2D = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            grid2D.add(new ArrayList<>(Collections.nCopies(m, 0)));
        }

        // --- Reverse a list ---
        List<Integer> toReverse = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.reverse(toReverse);  // modifies in place

        // --- Sort a list ---
        List<Integer> toSort = new ArrayList<>(List.of(5, 2, 8, 1, 9));
        Collections.sort(toSort);                          // ascending
        Collections.sort(toSort, Collections.reverseOrder());  // descending

        // --- Shuffle a list ---
        List<Integer> toShuffle = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.shuffle(toShuffle);

        // --- Find min/max ---
        List<Integer> numbers = List.of(5, 2, 8, 1, 9);
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        // --- Frequency count ---
        List<String> items = List.of("a", "b", "a", "c", "a");
        int countA = Collections.frequency(items, "a");  // 3

        System.out.println("\n=== Done! ===");
    }

    static void processArray(int[] arr) {
        System.out.println("Processing array of length: " + arr.length);
    }
}
