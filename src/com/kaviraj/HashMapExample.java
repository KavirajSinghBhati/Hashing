package com.kaviraj;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> myData = new HashMap<String, Integer>();

        /* put() in HashMap
           returns the previous value associated with key,
           or null if there was no mapping for key.
           (A null return can also indicate that the map previously associated null with key.)
        */
        myData.put("Kaviraj", 10);
        myData.put("Undergrad student", 15);
        myData.put("8.65 GPA", 20);

        System.out.println(myData); // {Undergrad student=15, Kaviraj=10, 8.65 GPA=20}

        //size() function
        System.out.println(myData.size());  //3

        //Traversing the HashMap

        for (Map.Entry<String, Integer> e : myData.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        //O/P
        /*
           Undergrad student: 15
           Kaviraj: 10
           8.65 GPA: 20
        */

        //containsKey() and containsValue() in HashMap

        System.out.println(myData.containsKey("Kaviraj"));  //true
        System.out.println(myData.containsKey("Projects")); //false
        System.out.println(myData.containsValue(20));  //true
        System.out.println(myData.containsValue(23));  //false

        //remove(key) in HashMap => returns value associated with the key removed, otherwise returns null

        myData.put("College", 0);
        System.out.println(myData.size());  //4

        myData.remove("College");
        System.out.println(myData.size());  //3

        // get(key) => return value corresponding to the given key

        System.out.println(myData.get("Kaviraj"));  // 10
        System.out.println(myData.get("8.65 GPA")); // 20
        System.out.println(myData.get("projects")); // null
    }

}
