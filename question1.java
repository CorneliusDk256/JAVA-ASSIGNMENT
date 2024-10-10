
//KAYOBYO CORNELIUS DANIEL 2023/DCS/DAY/1479

import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        // Creating an ArrayList to store integers 

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList that has been created 
        numbers.add(10);
        numbers.add(20);
        numbers.add(30); 


        // Accessing the  elements by index
        System.out.println("Element at index 0: " + numbers.get(0)); 


        // Remove an element. this is done by index
        numbers.remove(1);

        // Printing out the updated arraylist
        System.out.println("Updated ArrayList: " + numbers);
    }
}
