package com.rs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'a','b','c','d'};

        System.out.println(max(intArray[0], intArray[1], intArray[2]));
        System.out.println(max(charArray[0], charArray[1], charArray[2]));
    }

    // T: type array
    // generic method
    public static <T> void printArray(T[] toPrint) {
        for (T p: toPrint) {
            System.out.printf("%s ", p);
        }
            System.out.println();
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;
        if (b.compareTo(m) > 0) m = b;
        if (c.compareTo(m) > 0) m = c;
        return m;
    }
}
