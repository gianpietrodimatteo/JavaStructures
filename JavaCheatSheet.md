# Java Data Structures Cheat Sheet

## Quick Reference: One-Liner Initialization

| Structure | Mutable One-Liner |
|-----------|-------------------|
| List | `new ArrayList<>(List.of(1, 2, 3))` |
| Set | `new HashSet<>(List.of(1, 2, 3))` |
| Map | `new HashMap<>(Map.of("a", 1, "b", 2))` |
| Queue | `new LinkedList<>(List.of("a", "b", "c"))` |
| Deque | `new ArrayDeque<>(List.of("a", "b", "c"))` |
| Sorted Set | `new TreeSet<>(List.of(3, 1, 2))` |
| Sorted Map | `new TreeMap<>(Map.of("b", 2, "a", 1))` |

## Quick Reference: Immutable Initialization (Java 9+)

| Structure | Immutable One-Liner |
|-----------|---------------------|
| List | `List.of(1, 2, 3)` |
| Set | `Set.of("a", "b", "c")` |
| Map | `Map.of("a", 1, "b", 2)` |

## Quick Reference: Conversions

| From → To | Code |
|-----------|------|
| List → Set | `new HashSet<>(myList)` |
| Set → List | `new ArrayList<>(mySet)` |
| Array → List | `new ArrayList<>(Arrays.asList(arr))` |
| List → Array | `list.toArray(new String[0])` |
| Map → Keys | `map.keySet()` |
| Map → Values | `new ArrayList<>(map.values())` |
| Map → Entries | `new ArrayList<>(map.entrySet())` |
| Primitive[] → List | `Arrays.stream(arr).boxed().toList()` |
| List → int[] | `list.stream().mapToInt(Integer::intValue).toArray()` |

## Common Operations by Structure

### ArrayList<E>
```java
list.add(elem)           // add to end
list.add(index, elem)    // insert at index
list.get(index)          // access by index
list.set(index, elem)    // replace at index
list.remove(index)       // remove by index
list.remove(elem)        // remove first occurrence
list.contains(elem)      // check existence
list.indexOf(elem)       // find index (-1 if not found)
list.size()              // number of elements
list.isEmpty()           // check if empty
list.clear()             // remove all elements
```

### HashMap<K, V>
```java
map.put(key, value)              // add/update entry
map.get(key)                     // get value (null if not found)
map.getOrDefault(key, default)   // get with fallback
map.containsKey(key)             // check key exists
map.containsValue(value)         // check value exists
map.remove(key)                  // remove entry
map.keySet()                     // all keys
map.values()                     // all values
map.entrySet()                   // all entries
map.size()                       // number of entries
```

### HashSet<E>
```java
set.add(elem)        // add element (returns false if duplicate)
set.remove(elem)     // remove element
set.contains(elem)   // check existence
set.size()           // number of elements
set.isEmpty()        // check if empty
set.clear()          // remove all elements
```

### Stack<E>
```java
stack.push(elem)     // add to top
stack.pop()          // remove and return top
stack.peek()         // view top without removing
stack.isEmpty()      // check if empty
stack.search(elem)   // 1-based position from top (-1 if not found)
```

### Queue<E> (LinkedList)
```java
queue.offer(elem)    // add to back (safer than add)
queue.poll()         // remove and return front (null if empty)
queue.peek()         // view front without removing
queue.isEmpty()      // check if empty
queue.size()         // number of elements
```

### Deque<E> (ArrayDeque/LinkedList)
```java
deque.addFirst(elem)     // add to front
deque.addLast(elem)      // add to back
deque.removeFirst()      // remove from front
deque.removeLast()       // remove from back
deque.peekFirst()        // view front
deque.peekLast()         // view back
```

### PriorityQueue<E>
```java
pq.offer(elem)       // add element
pq.poll()            // remove smallest (or largest for max-heap)
pq.peek()            // view smallest without removing
pq.isEmpty()         // check if empty
pq.size()            // number of elements

// Max-heap creation:
new PriorityQueue<>(Collections.reverseOrder())
```

## Traversal Patterns

### Standard for loop (with index)
```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

### Enhanced for loop
```java
for (String item : list) {
    System.out.println(item);
}
```

### Map traversal (keys)
```java
for (String key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

### Map traversal (entries - more efficient)
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

### 2D Array traversal
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// Or enhanced:
for (int[] row : matrix) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```

## Matrix Reference

### 2D Array
```java
// Declaration
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Empty matrix
int[][] grid = new int[rows][cols];

// Access
int val = matrix[row][col];

// Dimensions
int rows = matrix.length;
int cols = matrix[0].length;
```

### 2D ArrayList
```java
// Declaration
List<List<Integer>> matrix2D = new ArrayList<>(List.of(
    new ArrayList<>(List.of(1, 2, 3)),
    new ArrayList<>(List.of(4, 5, 6)),
    new ArrayList<>(List.of(7, 8, 9))
));

// Access
int val = matrix2D.get(row).get(col);

// Add to row
matrix2D.get(row).add(value);

// Dimensions
int rows = matrix2D.size();
int cols = matrix2D.get(0).size();
```

## Combining Collections

```java
// Lists
list1.addAll(list2);

// Sets
set1.addAll(set2);       // union
set1.retainAll(set2);    // intersection
set1.removeAll(set2);    // difference

// Maps
map1.putAll(map2);
```

## Useful Utility Methods

```java
// Collections class
Collections.sort(list);                          // ascending
Collections.sort(list, Collections.reverseOrder()); // descending
Collections.reverse(list);                       // reverse in place
Collections.shuffle(list);                       // randomize
Collections.min(list);                           // find minimum
Collections.max(list);                           // find maximum
Collections.frequency(list, elem);               // count occurrences
Collections.nCopies(n, elem);                    // list of n copies

// Arrays class
Arrays.fill(array, value);                       // fill array
Arrays.sort(array);                              // sort array
Arrays.binarySearch(array, key);                 // search sorted array
Arrays.equals(arr1, arr2);                       // compare arrays
Arrays.copyOf(array, newLength);                 // copy with new size
Arrays.asList(array);                            // array to fixed-size list
```

## Choosing the Right Structure

| Need | Use |
|------|-----|
| Indexed access, order matters | ArrayList |
| Fast add/remove at ends | LinkedList / ArrayDeque |
| No duplicates | HashSet |
| No duplicates + sorted | TreeSet |
| Key-value pairs | HashMap |
| Key-value pairs + sorted keys | TreeMap |
| LIFO (Last In First Out) | Stack or ArrayDeque |
| FIFO (First In First Out) | Queue (LinkedList) |
| Priority ordering | PriorityQueue |
| Both ends access | Deque (ArrayDeque) |
