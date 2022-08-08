package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // 1. Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] intArray = {1, 1, 2, 3, 5, 8};

        // 2. Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for (int i = 0; i < intArray.length; i++)
            if (intArray[i] % 2 == 0) {
                System.out.println(intArray[i]);
            }
//            System.out.println(intArray[i]);

        // 3. For this exercise, use the string I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.
        // Use the split method to divide the string at each space and store the individual words in an array.
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] words = text.split(" ");
        String [] sentences = text.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));

        // 4. Print the array of words to verify that your code works. The syntax is:
        // System.out.println(Arrays.toString(arrayName));


        // 5. Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
    }
}


