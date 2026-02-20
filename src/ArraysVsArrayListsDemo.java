import java.util.ArrayList;
import java.util.Arrays;

public class ArraysVsArrayListsDemo {

    public static void main(String[] args) {

        // ARRAY EXAMPLE (fixed size)
        int[] scoresArray = new int[3];
        scoresArray[0] = 85;
        scoresArray[1] = 90;
        scoresArray[2] = 95;

        System.out.println("Array length: " + scoresArray.length);
        System.out.println("Array contents: " + Arrays.toString(scoresArray));

        // ARRAYLIST EXAMPLE (dynamic size)
        ArrayList<Integer> scoresList = new ArrayList<>();

        scoresList.add(85);
        scoresList.add(90);
        scoresList.add(95);

        System.out.println("\nArrayList size: " + scoresList.size());
        System.out.println("ArrayList contents: " + scoresList);

        // Add element
        scoresList.add(100);

        System.out.println("\nAfter adding 100:");
        System.out.println("ArrayList size: " + scoresList.size());
        System.out.println("ArrayList contents: " + scoresList);

        // Remove element
        scoresList.remove(Integer.valueOf(90));

        System.out.println("\nAfter removing 90:");
        System.out.println("ArrayList size: " + scoresList.size());
        System.out.println("ArrayList contents: " + scoresList);

        // Index access comparison
        System.out.println("\nArray index 0: " + scoresArray[0]);
        System.out.println("ArrayList index 0: " + scoresList.get(0));
        
     // KEY DIFFERENCES:
     // 1) Arrays are fixed-size; ArrayLists resize dynamically.
     // 2) Arrays can store primitives (int); ArrayLists store objects (Integer).
     // 3) Arrays use .length and [] ; ArrayLists use .size() and get()/set().
    }
}