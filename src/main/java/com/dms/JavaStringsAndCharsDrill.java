package com.dms;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Java Strings and Characters - Comprehensive Study Guide
 * Practice file for memorizing string and character operations
 */
public class JavaStringsAndCharsDrill {

    public static void main(String[] args) {

        // ============================================================
        // 1. CHARACTERS (char)
        // ============================================================

        System.out.println("=== CHARACTERS (char) ===\n");

        // Declaration and literals
        char letter = 'A';
        char digit = '5';
        char symbol = '@';
        char newline = '\n';        // escape sequence
        char tab = '\t';            // tab
        char quote = '\'';          // single quote
        char backslash = '\\';      // backslash

        // Unicode representation
        char unicode1 = '\u0041';   // 'A' in unicode
        char unicode2 = '\u03A9';   // Greek capital omega Ω
        char heart = '\u2764';      // ❤

        System.out.println("Letter: " + letter);
        System.out.println("Unicode A: " + unicode1);
        System.out.println("Unicode Omega: " + unicode2);
        System.out.println("Unicode Heart: " + heart);

        // Character utility methods
        char testChar = 'a';

        System.out.println("\n--- Character Utility Methods ---");
        System.out.println("Character.isLetter('a'): " + Character.isLetter(testChar));
        System.out.println("Character.isDigit('a'): " + Character.isDigit(testChar));
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Character.isLetterOrDigit('5'): " + Character.isLetterOrDigit('5'));
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' '));
        System.out.println("Character.isUpperCase('a'): " + Character.isUpperCase(testChar));
        System.out.println("Character.isLowerCase('a'): " + Character.isLowerCase(testChar));

        System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase(testChar));
        System.out.println("Character.toLowerCase('A'): " + Character.toLowerCase('A'));

        // Comparing characters
        System.out.println("\n--- Character Comparison ---");
        System.out.println("'a' == 'a': " + ('a' == 'a'));
        System.out.println("'a' < 'b': " + ('a' < 'b'));
        System.out.println("Character.compare('a', 'b'): " + Character.compare('a', 'b'));

        // ============================================================
        // 2. STRINGS (String)
        // ============================================================

        System.out.println("\n\n=== STRINGS (String) ===\n");

        // String creation
        String str1 = "Hello";              // string literal
        String str2 = new String("World");  // using constructor (less common)
        String str3 = "";                   // empty string

        // Immutability demonstration
        String original = "Java";
        String modified = original.concat(" Programming");  // original is unchanged
        System.out.println("Original: " + original);        // still "Java"
        System.out.println("Modified: " + modified);        // "Java Programming"

        // Common methods
        String text = "  Hello, World!  ";

        System.out.println("\n--- Common String Methods ---");
        System.out.println("length(): " + text.length());
        System.out.println("charAt(2): " + text.charAt(2));
        System.out.println("substring(2, 7): " + text.substring(2, 7));      // from index 2 to 6
        System.out.println("substring(7): " + text.substring(7));             // from index 7 to end
        System.out.println("toUpperCase(): " + text.toUpperCase());
        System.out.println("toLowerCase(): " + text.toLowerCase());
        System.out.println("trim(): '" + text.trim() + "'");                 // removes leading/trailing whitespace
        System.out.println("replace('o', '0'): " + text.replace('o', '0'));
        System.out.println("replace(\"World\", \"Java\"): " + text.replace("World", "Java"));

        // More useful methods
        System.out.println("\n--- More String Methods ---");
        String sample = "Java Programming";
        System.out.println("startsWith(\"Java\"): " + sample.startsWith("Java"));
        System.out.println("endsWith(\"ing\"): " + sample.endsWith("ing"));
        System.out.println("contains(\"Program\"): " + sample.contains("Program"));
        System.out.println("indexOf('a'): " + sample.indexOf('a'));                   // first occurrence
        System.out.println("lastIndexOf('a'): " + sample.lastIndexOf('a'));          // last occurrence
        System.out.println("indexOf(\"Programming\"): " + sample.indexOf("Programming"));
        System.out.println("isEmpty(): " + sample.isEmpty());
        System.out.println("isBlank(): " + "   ".isBlank());                         // true if only whitespace

        // String comparison
        System.out.println("\n--- String Comparison ---");
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "Hello";

        System.out.println("s1 == s2: " + (s1 == s2));                    // true (same reference in string pool)
        System.out.println("s1 == s3: " + (s1 == s3));                    // false (different objects)
        System.out.println("s1.equals(s2): " + s1.equals(s2));            // true (same content)
        System.out.println("s1.equals(s3): " + s1.equals(s3));            // true (same content)
        System.out.println("s1.equals(s4): " + s1.equals(s4));            // false (different case)
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4));  // true

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));      // 0 (equal)
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));      // positive (s1 > s4 lexicographically)
        System.out.println("s4.compareTo(s1): " + s4.compareTo(s1));      // negative (s4 < s1)

        // StringBuilder for efficient concatenation
        System.out.println("\n--- StringBuilder ---");
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" is");
        sb.append(" awesome");
        System.out.println("StringBuilder result: " + sb.toString());

        sb.insert(4, " 17");                // insert at index 4
        System.out.println("After insert: " + sb.toString());

        sb.delete(4, 7);                    // delete from index 4 to 6
        System.out.println("After delete: " + sb.toString());

        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        sb.reverse();  // reverse back
        sb.replace(0, 4, "Python");         // replace from index 0 to 3
        System.out.println("After replace: " + sb.toString());

        // StringBuilder vs String concatenation
        System.out.println("\n--- String vs StringBuilder Performance ---");
        // Bad: creates many intermediate String objects
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += i + " ";  // inefficient!
        }
        System.out.println("String concatenation: " + result);

        // Good: efficient for loops
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sbResult.append(i).append(" ");
        }
        System.out.println("StringBuilder: " + sbResult.toString());

        // ============================================================
        // 3. CONVERSIONS BETWEEN CHAR AND STRING
        // ============================================================

        System.out.println("\n\n=== CONVERSIONS BETWEEN CHAR AND STRING ===\n");

        // char to String
        char ch = 'A';
        System.out.println("--- char to String ---");
        String fromChar1 = String.valueOf(ch);
        String fromChar2 = "" + ch;
        String fromChar3 = Character.toString(ch);
        System.out.println("String.valueOf(ch): " + fromChar1);
        System.out.println("\"\" + ch: " + fromChar2);
        System.out.println("Character.toString(ch): " + fromChar3);

        // String to char array
        System.out.println("\n--- String to char array ---");
        String word = "Hello";
        char[] charArray = word.toCharArray();
        System.out.println("word.toCharArray(): " + Arrays.toString(charArray));

        // char array to String
        System.out.println("\n--- char array to String ---");
        char[] chars = {'J', 'a', 'v', 'a'};
        String fromArray = new String(chars);
        System.out.println("new String(charArray): " + fromArray);

        // String to single char
        System.out.println("\n--- String to single char ---");
        String single = "X";
        char singleChar = single.charAt(0);
        System.out.println("single.charAt(0): " + singleChar);

        // ============================================================
        // 4. LOOPING THROUGH STRINGS
        // ============================================================

        System.out.println("\n\n=== LOOPING THROUGH STRINGS ===\n");

        String loopStr = "Java";

        // Classic for loop with charAt()
        System.out.println("--- Classic for loop with charAt() ---");
        for (int i = 0; i < loopStr.length(); i++) {
            char c = loopStr.charAt(i);
            System.out.println("Index " + i + ": " + c);
        }

        // Enhanced for loop with toCharArray()
        System.out.println("\n--- Enhanced for loop with toCharArray() ---");
        for (char c : loopStr.toCharArray()) {
            System.out.println(c);
        }

        // Looping backwards
        System.out.println("\n--- Looping backwards ---");
        for (int i = loopStr.length() - 1; i >= 0; i--) {
            System.out.println(loopStr.charAt(i));
        }

        // chars() stream approach (Java 8+)
        System.out.println("\n--- chars() stream approach ---");
        loopStr.chars()
               .forEach(c -> System.out.println((char) c));

        // Using chars() with filters
        System.out.println("\n--- Stream with filter (uppercase only) ---");
        String mixed = "HeLLo WoRLd";
        mixed.chars()
             .filter(Character::isUpperCase)
             .forEach(c -> System.out.println((char) c));

        // ============================================================
        // 5. PARSING AND FORMATTING
        // ============================================================

        System.out.println("\n\n=== PARSING AND FORMATTING ===\n");

        // String to numbers
        System.out.println("--- String to numbers ---");
        String numStr = "123";
        int intValue = Integer.parseInt(numStr);
        System.out.println("Integer.parseInt(\"123\"): " + intValue);

        String doubleStr = "45.67";
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("Double.parseDouble(\"45.67\"): " + doubleValue);

        String longStr = "9876543210";
        long longValue = Long.parseLong(longStr);
        System.out.println("Long.parseLong(\"9876543210\"): " + longValue);

        // Handling parse errors
        System.out.println("\n--- Handling parse errors ---");
        try {
            int invalid = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // Numbers to String
        System.out.println("\n--- Numbers to String ---");
        int num = 42;
        String str1FromNum = String.valueOf(num);
        String str2FromNum = Integer.toString(num);
        String str3FromNum = "" + num;
        System.out.println("String.valueOf(42): " + str1FromNum);
        System.out.println("Integer.toString(42): " + str2FromNum);
        System.out.println("\"\" + 42: " + str3FromNum);

        // String.format()
        System.out.println("\n--- String.format() ---");
        String name = "Alice";
        int age = 30;
        double height = 5.6;

        String formatted = String.format("Name: %s, Age: %d, Height: %.1f", name, age, height);
        System.out.println(formatted);

        // Common format specifiers
        System.out.println(String.format("Integer: %d", 123));
        System.out.println(String.format("Float: %.2f", 3.14159));
        System.out.println(String.format("String: %s", "hello"));
        System.out.println(String.format("Padded: %5d", 42));       // "   42"
        System.out.println(String.format("Zero-padded: %05d", 42)); // "00042"

        // Split
        System.out.println("\n--- Split ---");
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("Split by comma: " + Arrays.toString(fruits));

        String sentence = "one two three four";
        String[] words = sentence.split(" ");
        System.out.println("Split by space: " + Arrays.toString(words));

        String data = "a:b:c:d";
        String[] parts = data.split(":");
        System.out.println("Split by colon: " + Arrays.toString(parts));

        // Split with limit
        String limited = "a-b-c-d-e";
        String[] limitedParts = limited.split("-", 3);  // max 3 parts
        System.out.println("Split with limit: " + Arrays.toString(limitedParts));

        // Join
        System.out.println("\n--- Join ---");
        String[] items = {"apple", "banana", "cherry"};
        String joined = String.join(", ", items);
        System.out.println("String.join: " + joined);

        List<String> list = Arrays.asList("Java", "Python", "C++");
        String joinedList = String.join(" | ", list);
        System.out.println("Join list: " + joinedList);

        // Using streams to join
        String streamJoin = Arrays.stream(items)
                                  .collect(Collectors.joining(" - "));
        System.out.println("Stream join: " + streamJoin);

        // ============================================================
        // BONUS: COMMON STRING PROBLEMS
        // ============================================================

        System.out.println("\n\n=== BONUS: COMMON STRING PATTERNS ===\n");

        // Reverse a string
        System.out.println("--- Reverse a string ---");
        String toReverse = "hello";
        String reversed = new StringBuilder(toReverse).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // Check if palindrome
        System.out.println("\n--- Check if palindrome ---");
        String palindrome = "racecar";
        boolean isPalindrome = palindrome.equals(new StringBuilder(palindrome).reverse().toString());
        System.out.println(palindrome + " is palindrome: " + isPalindrome);

        // Count character occurrences
        System.out.println("\n--- Count character occurrences ---");
        String countStr = "hello world";
        char target = 'l';
        int count = 0;
        for (char c : countStr.toCharArray()) {
            if (c == target) count++;
        }
        System.out.println("Count of '" + target + "' in \"" + countStr + "\": " + count);

        // Remove whitespace
        System.out.println("\n--- Remove whitespace ---");
        String withSpaces = "h e l l o";
        String noSpaces = withSpaces.replace(" ", "");
        System.out.println("Original: \"" + withSpaces + "\"");
        System.out.println("No spaces: \"" + noSpaces + "\"");

        // Check if string contains only digits
        System.out.println("\n--- Check if string contains only digits ---");
        String digitStr = "12345";
        boolean allDigits = digitStr.chars().allMatch(Character::isDigit);
        System.out.println("\"" + digitStr + "\" contains only digits: " + allDigits);

        System.out.println("\n=== Done! ===");
    }
}
