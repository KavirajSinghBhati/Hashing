package com.kaviraj;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> string = new HashSet<String>();

        //Add function in HashSet (it returns a boolean => true if element added, false if element not added
        // because no two keys can be the same

        string.add("Kaviraj");
        string.add("Undergrad student");
        string.add("8.65 GPA");
        System.out.println(string);   // [Undergrad student, Kaviraj, 8.65 GPA] order => different
        boolean isNameAgainAdded = string.add("Kaviraj");
        System.out.println(isNameAgainAdded);  // false, because Kaviraj already exists in the HashSet

        //Contains function in HashSet
        System.out.println(string.contains("Kaviraj"));  //true
        System.out.println(string.contains("Projects")); //false

        //iterator function

        Iterator<String> i = string.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }   // Undergrad student Kaviraj 8.65 GPA

        System.out.println();

        // we can also use enhanced for loop

        for (String s : string) {
            System.out.print(s + " ");
        }  // Undergrad student Kaviraj 8.65 GPA

        System.out.println();

        // size function in HashSet

        System.out.println(string.size());  // 3

        // remove function in HashSet (it returns a boolean => true if element removed, false if element not removed
        // it doesn't exist

        string.add("I hate my college");
        System.out.println(string);  //[Undergrad student, Kaviraj, I hate my college, 8.65 GPA]
        boolean isCollegeRemoved = string.remove("I hate my college");
        System.out.println(isCollegeRemoved);  //true

        // isEmpty() in HashSet

        System.out.println(string.isEmpty());  //false

        // clear() in HashSet => clears the HashSet

        string.clear();
        System.out.println(string.isEmpty());  //true
    }
}
