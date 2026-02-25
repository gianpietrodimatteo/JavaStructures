import java.util.*;

/**
 * Java Data Structures - Fill in the Blanks Exercises
 * 
 * Instructions:
 * 1. Replace each _______ with the correct code
 * 2. Some blanks require a single token, others require a full statement
 * 3. Compile and run to check your answers
 * 4. Solutions are at the bottom of this file (no peeking!)
 */
public class JavaExercisesSolution {

    public static void main(String[] args) {

        // ============================================================
        // EXERCISE 1: Arrays
        // ============================================================
        
        // 1a. Create an array of 5 integers with values 10, 20, 30, 40, 50
        int[] nums = _______;

        // 1b. Create an empty String array with capacity for 4 elements
        String[] words = _______;

        // 1c. Set the first element to "hello" and last element to "world"
        words[_______] = "hello";
        words[_______] = "world";

        // 1d. Print all elements using enhanced for loop
        for (_______ word : _______) {
            System.out.println(word);
        }

        // 1e. Get the size of the array
        int len = nums._______;

        // 1f. Create an array of floats with 4 positions
        _______ decimals = _______

        // 1g. Create a vaeiable to hold the precise value for pi
        // Note: double is 64-bit (15-17 decimal digits), float is 32-bit (6-7 digits)
        _______ pi = 3.141592653589793d;

        // 1h. Set the value for a float
        float temperature = _______;


        // ============================================================
        // EXERCISE 2: ArrayList
        // ============================================================
        
        // 2a. Create an ArrayList of Strings
        _______ names = new _______<>();

        // 2b. Add "Alice", "Bob", "Charlie"
        names._______("Alice");
        names._______("Bob");
        names._______("Charlie");

        // 2c. Replace "Zara" at the beginning (index 0)
        names._______(_______, "Zara");

        // 2d. Remove "Bob" by value
        names._______("Bob");

        // 2e. Get the element at index 1
        String second = names._______(1);

        // 2f. Check if "Alice" exists in the list
        boolean hasAlice = names._______("Alice");

        // 2g. Get the length of the list
        int size = names._______();


        // ============================================================
        // EXERCISE 3: ArrayList One-Liners
        // ============================================================
        
        // 3a. Create a mutable ArrayList with initial values 1, 2, 3
        List<Integer> mutableList = new ArrayList<>(_______.of(1, 2, 3));

        // 3b. Create an immutable list with "x", "y", "z" (Java 9+)
        List<String> immutableList = _______.of("x", "y", "z");

        // 3c. Create a Boolean array of 10 positions filled with false (default)
        Boolean[] boolArray = new _______[10];

        // 3d. Create and fill an array with pattern 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        int[] pattern = new int[10];
        for (int i = 0; i < pattern._______; i++) {
            pattern[i] = _______;
        }

        // 3e. Create a list and fill 10 positions with value 0
        List<Integer> zeros = new ArrayList<>(Collections._______(10, 0));


        // ============================================================
        // EXERCISE 4: HashMap
        // ============================================================
        
        // 4a. Create a HashMap mapping String to Integer
        _______<String, Integer> ages = new _______<>();

        // 4b. Add entries: "Alice"->30, "Bob"->25, "Charlie"->35
        ages._______("Alice", 30);
        ages._______("Bob", 25);
        ages._______("Charlie", 35);

        // 4c. Get Alice's age
        int aliceAge = ages._______("Alice");

        // 4d. Get Eve's age with default value 0 if not found
        int eveAge = ages._______("Eve", 0);

        // 4e. Check if "Bob" exists as a key
        boolean hasBob = ages._______("Bob");

        // 4f. Remove Bob's entry
        ages._______("Bob");

        // 4g. Loop through all entries and print "name: age"
        for (_______ entry : ages._______()) {
            System.out.println(entry._______() + ": " + entry._______());
        }


        // ============================================================
        // EXERCISE 5: HashMap One-Liner
        // ============================================================
        
        // 5a. Create a mutable HashMap with "a"->1, "b"->2 in one line
        Map<String, Integer> quickMap = new HashMap<>(_______.of("a", 1, "b", 2));


        // ============================================================
        // EXERCISE 6: HashSet
        // ============================================================
        
        // 6a. Create a HashSet of Integers
        _______<Integer> uniqueNums = new _______<>();

        // 6b. Add 10, 20, 30, and 10 again (duplicate)
        uniqueNums._______(10);
        uniqueNums._______(20);
        uniqueNums._______(30);
        uniqueNums._______(10);  // what happens?

        // 6c. Check if 20 exists
        boolean has20 = uniqueNums._______(20);

        // 6d. Remove 30
        uniqueNums._______(30);

        // 6e. Get the number of elements
        int setSize = uniqueNums._______();


        // ============================================================
        // EXERCISE 7: HashSet One-Liner
        // ============================================================
        
        // 7a. Create a mutable HashSet with "red", "green", "blue"
        Set<String> colors = new HashSet<>(_______.of("red", "green", "blue"));


        // ============================================================
        // EXERCISE 8: Stack
        // ============================================================
        
        // 8a. Create a Stack of Integers
        _______<Integer> stack = new _______<>();

        // 8b. Push 1, 2, 3 onto the stack
        stack._______(1);
        stack._______(2);
        stack._______(3);

        // 8c. Look at the top element without removing
        int top = stack._______();

        // 8d. Remove and return the top element
        int popped = stack._______();

        // 8e. Check if stack is empty
        boolean empty = stack._______();


        // ============================================================
        // EXERCISE 9: Queue
        // ============================================================
        
        // 9a. Create a Queue using LinkedList
        _______<String> queue = new _______<>();

        // 9b. Add "first", "second", "third" to the queue
        queue._______("first");
        queue._______("second");
        queue._______("third");

        // 9c. Look at the front element without removing
        String front = queue._______();

        // 9d. Remove and return the front element
        String removed = queue._______();


        // ============================================================
        // EXERCISE 10: PriorityQueue
        // ============================================================
        
        // 10a. Create a min-heap PriorityQueue
        _______<Integer> minHeap = new _______<>();

        // 10b. Add 5, 1, 3, 2, 4
        minHeap._______(5);
        minHeap._______(1);
        minHeap._______(3);
        minHeap._______(2);
        minHeap._______(4);

        // 10c. Get the smallest element (without removing)
        int smallest = minHeap._______();

        // 10d. Create a max-heap using Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(_______._______());


        // ============================================================
        // EXERCISE 11: Conversions
        // ============================================================
        
        List<String> myList = new ArrayList<>(List.of("a", "b", "a", "c"));

        // 11a. Convert List to Set (remove duplicates)
        Set<String> mySet = new _______(myList);

        // 11b. Convert Set back to List
        List<String> backToList = new _______(mySet);

        // 11c. Convert array to List
        String[] myArray = {"x", "y", "z"};
        List<String> fromArray = new ArrayList<>(_______.asList(myArray));

        // 11d. Convert List to array
        String[] toArray = fromArray._______(new String[0]);


        // ============================================================
        // EXERCISE 12: Matrix (2D Array)
        // ============================================================
        
        // 12a. Create a 3x3 matrix with values 1-9
        int[][] matrix = {
            {1, 2, 3},
            {_______, _______, _______},
            {7, 8, 9}
        };

        // 12b. Create an empty 4x5 matrix
        int[][] grid = new int[_______][_______];

        // 12c. Access center element (row 1, col 1)
        int center = matrix[_______][_______];

        // 12d. Get number of rows
        int rows = matrix._______;

        // 12e. Get number of columns (from first row)
        int cols = matrix[0]._______;

        // 12f. Traverse and print matrix using nested enhanced for loops
        for (_______ row : matrix) {
            for (_______ val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


        // ============================================================
        // EXERCISE 13: 2D ArrayList
        // ============================================================
        
        // 13a. Create a 2D ArrayList initialized with values
        List<List<Integer>> matrix2D = new ArrayList<>(List.of(
            new ArrayList<>(List.of(1, 2, 3)),
            new _______<>(_______.of(4, 5, 6)),
            new ArrayList<>(List.of(7, 8, 9))
        ));

        // 13b. Access element at row 1, col 2
        int val = matrix2D._______(1)._______(2);

        // 13c. Add value 99 to the first row
        matrix2D._______(0)._______(99);


        // ============================================================
        // EXERCISE 14: Combining Collections
        // ============================================================
        
        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> listB = List.of(4, 5, 6);

        // 14a. Add all elements from listB to listA
        listA._______(listB);

        Map<String, Integer> mapA = new HashMap<>(Map.of("a", 1, "b", 2));
        Map<String, Integer> mapB = Map.of("c", 3, "d", 4);

        // 14b. Add all entries from mapB to mapA
        mapA._______(mapB);


        // ============================================================
        // EXERCISE 15: Characters
        // ============================================================

        // 15a. Declare a char with value 'A'
        _______ letter = 'A';

        // 15b. Declare a char using unicode for 'B' (unicode: \u0042)
        char unicodeLetter = _______;

        // 15c. Check if 'a' is a letter
        boolean isLetter = _______.isLetter('a');

        // 15d. Check if '5' is a digit
        boolean isDigit = Character._______('5');

        // 15e. Convert 'a' to uppercase
        char upper = _______.toUpperCase('a');

        // 15f. Convert 'Z' to lowercase
        char lower = Character._______('Z');


        // ============================================================
        // EXERCISE 16: String Basics
        // ============================================================

        // 16a. Create a string with value "Hello"
        _______ greeting = "Hello";

        // 16b. Get the length of the string
        int strLen = greeting._______();

        // 16c. Get the character at index 1
        char secondChar = greeting._______(1);

        // 16d. Get substring from index 1 to 3 (not including 3)
        String sub = greeting._______(1, 3);

        // 16e. Convert to uppercase
        String upperStr = greeting._______();

        // 16f. Convert to lowercase
        String lowerStr = greeting._______();

        // 16g. Trim whitespace from "  hello  "
        String trimmed = "  hello  "._______;

        // 16h. Replace 'l' with 'L' in "hello"
        String replaced = "hello"._______(_______, _______);


        // ============================================================
        // EXERCISE 17: String Methods
        // ============================================================

        String text = "Java Programming";

        // 17a. Check if text starts with "Java"
        boolean starts = text._______("Java");

        // 17b. Check if text ends with "ing"
        boolean ends = text._______("ing");

        // 17c. Check if text contains "Program"
        boolean contains = text._______("Program");

        // 17d. Find the index of first 'a'
        int index = text._______('a');

        // 17e. Find the index of last 'a'
        int lastIndex = text._______('a');

        // 17f. Check if string is empty
        boolean empty2 = ""._______;


        // ============================================================
        // EXERCISE 18: String Comparison
        // ============================================================

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        // 18a. Compare s1 and s2
        boolean equal = s1._______(s2);

        // 18b. Compare s1 and s3 ignoring case
        boolean equalIgnoreCase = s1._______(s3);

        // 18c. Compare s1 and s2 (returns 0 if equal)
        int comparison = s1._______(s2);


        // ============================================================
        // EXERCISE 19: StringBuilder
        // ============================================================

        // 19a. Create a StringBuilder
        _______ sb = new _______();

        // 19b. Concatenate "Java"
        sb._______("Java");

        // 19c. Append " is fun"
        sb._______(_______);

        // 19d. Convert to String
        String result = sb._______();

        // 19e. Insert " 17" at index 4
        sb._______(4, " 17");

        // 19f. Remove characters from index 4 to 7 (not including 7)
        sb._______(4, 7);

        // 19g. Reverse the StringBuilder
        sb._______();


        // ============================================================
        // EXERCISE 20: Char and String Conversions
        // ============================================================

        // 20a. Convert char 'A' to String using String
        char ch = 'A';
        String fromChar = _______._______(ch);

        // 20b. Convert char 'B' to String using concatenation
        String fromChar2 = _______ _ 'B';

        // 20c. Convert String "Hello" to char array
        String word = "Hello";
        char[] charArray = word._______();

        // 20d. Convert char array {'J', 'a', 'v', 'a'} to String
        char[] chars = {'J', 'a', 'v', 'a'};
        String stringFromArray = new _______(chars);

        // 20e. Get first character from String "X"
        String single = "X";
        char firstChar = single._______(0);


        // ============================================================
        // EXERCISE 21: Looping Through Strings
        // ============================================================

        String loopStr = "Java";

        // 21a. Loop through chars - fill in the condition
        for (int i = 0; _______ < loopStr._______; i++) {
            char c = loopStr._______(i);
        }

        // 21b. Loop using array of chars with enhanced for
        for (_______ c : loopStr._______()) {
            System.out.println(c);
        }

        // 21c. Loop backwards - fill in the initialization and condition
        for (int i = loopStr._______ - 1; _______ >= 0; i--) {
            System.out.println(loopStr.charAt(i));
        }


        // ============================================================
        // EXERCISE 22: Parsing
        // ============================================================

        // 22a. Convert "123" to int
        String numStr = "123";
        int num = _______._______(numStr);

        // 22b. Convert "45.67" to double
        String doubleStr = "45.67";
        double d = _______._______(doubleStr);

        // 22c. Convert int 42 to String
        int number = 42;
        String str = _______.valueOf(number);

        // 22d. Convert int 99 to String using Integer
        String str2 = _______._______(99);


        // ============================================================
        // EXERCISE 23: String Formatting
        // ============================================================

        String name = "Alice";
        int age = 30;

        // 23a. "Name: Alice, Age: 30"
        String formatted = _______._______("Name: %s, Age: %d", name, age);


        // ============================================================
        // EXERCISE 24: Split and Join
        // ============================================================

        // 24a. Split "apple,banana,cherry" by comma
        String csv = "apple,banana,cherry";
        String[] fruits = csv._______(",");

        // 24b. Split "one two three" by space
        String sentence = "one two three";
        String[] words2 = sentence._______(_______);

        // 24c. Join array {"red", "green", "blue"} with ", "
        String[] colors2 = {"red", "green", "blue"};
        String joined = _______.join(_______, colors2);


        // ============================================================
        // EXERCISE 25: Common String Patterns
        // ============================================================

        // 25a. Reverse a string "hello" using StringBuilder
        String toReverse = "hello";
        String reversed = new _______(toReverse)._______().toString();

        // 25b. Check if "racecar" is a palindrome
        String palindrome = "racecar";
        boolean isPalindrome = palindrome.equals(new StringBuilder(palindrome)._______.toString());

        // 25c. Remove all spaces from "h e l l o"
        String withSpaces = "h e l l o";
        String noSpaces = withSpaces._______(" ", "");


        System.out.println("\n=== All exercises completed! ===");
    }
}


/*
 * ============================================================
 * SOLUTIONS (Scroll down when ready)
 * ============================================================
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * EXERCISE 1: Arrays
 * 1a. {10, 20, 30, 40, 50}
 * 1b. new String[4]
 * 1c. 0, 3
 * 1d. String, words
 * 1e. length
 * 1f. float[], new float[4]
 * 1g. double
 * 1h. float
 *
 * EXERCISE 2: ArrayList
 * 2a. ArrayList<String>, ArrayList
 * 2b. add, add, add
 * 2c. add, 0
 * 2d. remove
 * 2e. get
 * 2f. contains
 * 2g. size
 *
 * EXERCISE 3: ArrayList One-Liners
 * 3a. List
 * 3b. List
 * 3c. Boolean
 * 3d. length, i+1
 * 3e. nCopies
 *
 * EXERCISE 4: HashMap
 * 4a. HashMap, HashMap
 * 4b. put, put, put
 * 4c. get
 * 4d. getOrDefault
 * 4e. containsKey
 * 4f. remove
 * 4g. Map.Entry<String, Integer>, entrySet, getKey, getValue
 *
 * EXERCISE 5: HashMap One-Liner
 * 5a. Map
 *
 * EXERCISE 6: HashSet
 * 6a. HashSet, HashSet
 * 6b. add, add, add, add
 * 6c. contains
 * 6d. remove
 * 6e. size
 *
 * EXERCISE 7: HashSet One-Liner
 * 7a. List (or Set)
 *
 * EXERCISE 8: Stack
 * 8a. Stack, Stack
 * 8b. push, push, push
 * 8c. peek
 * 8d. pop
 * 8e. isEmpty
 *
 * EXERCISE 9: Queue
 * 9a. Queue, LinkedList
 * 9b. offer, offer, offer (or add)
 * 9c. peek
 * 9d. poll
 *
 * EXERCISE 10: PriorityQueue
 * 10a. PriorityQueue, PriorityQueue
 * 10b. offer (or add) x5
 * 10c. peek
 * 10d. Collections, reverseOrder
 *
 * EXERCISE 11: Conversions
 * 11a. HashSet<>
 * 11b. ArrayList<>
 * 11c. Arrays
 * 11d. toArray
 *
 * EXERCISE 12: Matrix
 * 12a. 4, 5, 6
 * 12b. 4, 5
 * 12c. 1, 1
 * 12d. length
 * 12e. length
 * 12f. int[], int
 *
 * EXERCISE 13: 2D ArrayList
 * 13a. ArrayList, List
 * 13b. get, get
 * 13c. get, add
 *
 * EXERCISE 14: Combining Collections
 * 14a. addAll
 * 14b. putAll
 *
 * EXERCISE 15: Characters
 * 15a. char
 * 15b. '\u0042'
 * 15c. Character
 * 15d. isDigit
 * 15e. Character
 * 15f. toLowerCase
 *
 * EXERCISE 16: String Basics
 * 16a. String
 * 16b. length
 * 16c. charAt
 * 16d. substring
 * 16e. toUpperCase
 * 16f. toLowerCase
 * 16g. trim()
 * 16h. replace, 'l', 'L'
 *
 * EXERCISE 17: String Methods
 * 17a. startsWith
 * 17b. endsWith
 * 17c. contains
 * 17d. indexOf
 * 17e. lastIndexOf
 * 17f. isEmpty()
 *
 * EXERCISE 18: String Comparison
 * 18a. equals
 * 18b. equalsIgnoreCase
 * 18c. compareTo
 *
 * EXERCISE 19: StringBuilder
 * 19a. StringBuilder, StringBuilder
 * 19b. append
 * 19c. append, " is fun"
 * 19d. toString
 * 19e. insert
 * 19f. delete
 * 19g. reverse
 *
 * EXERCISE 20: Char and String Conversions
 * 20a. String
 * 20b. ""
 * 20c. toCharArray
 * 20d. String
 * 20e. charAt
 *
 * EXERCISE 21: Looping Through Strings
 * 21a. i, length, charAt
 * 21b. char, toCharArray
 * 21c. length, i
 *
 * EXERCISE 22: Parsing
 * 22a. Integer, parseInt
 * 22b. Double, parseDouble
 * 22c. String
 * 22d. Integer, toString
 *
 * EXERCISE 23: String Formatting
 * 23a. String, format
 *
 * EXERCISE 24: Split and Join
 * 24a. split
 * 24b. split, " "
 * 24c. String, ", "
 *
 * EXERCISE 25: Common String Patterns
 * 25a. StringBuilder, reverse
 * 25b. reverse()
 * 25c. replace
 */
