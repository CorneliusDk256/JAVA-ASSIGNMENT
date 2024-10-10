
//KAYOBYO CORNELIUS DANIEL 2023/DCS/DAY/1479

import java.util.HashSet;

public class question3 {
    public static void main(String[] args) {
        // Creating a HashSet to store integers
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements to the HashSet
        numbers.add(20); 

        numbers.add(40);
        numbers.add(60);
        numbers.add(80); // the duplicate element will be ignored

        // Prints the HashSet
        System.out.println("HashSet: " + numbers);
    }
}