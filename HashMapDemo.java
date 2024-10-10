

//KAYOBYO CORNELIUS DANIEL 2023/DCS/DAY/1479

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creates a HashMap to store key-value pairs
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Adds key-value pairs to the HashMap
        studentMarks.put("Cornelius", 95);
        studentMarks.put("Acram", 88);
        studentMarks.put("Patience", 92);

        // Accesses and prints the value for a given key
        System.out.println("Cornelius' marks: " + studentMarks.get("Cornelius"));
        System.out.println("Acram's marks: " + studentMarks.get("Acram"));
    }
}