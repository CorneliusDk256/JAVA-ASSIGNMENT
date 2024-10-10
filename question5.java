

//KAYOBYO CORNELIUS DANIEL 2023/DCS/DAY/1479

public class question5 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 
 20, 30};
        String[] strArray = {"Apple", "Banana", "Orange"};

        printArray(intArray);
        printArray(strArray);
    }
}