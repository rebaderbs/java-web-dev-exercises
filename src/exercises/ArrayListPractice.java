package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
//    public static void main (String[] args) {
//
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(4);
//        nums.add(12);
//        nums.add(28);
//        nums.add(17);
//        nums.add(3);
//        nums.add(19);
//        nums.add(45);
//        nums.add(86);
//        nums.add(2);
//
//        int sum = 0;
//        for (int integer : nums) {
//            if (integer % 2 == 0) {
//                sum += integer;
//            }
//        }
//        System.out.println(sum);
//    }

    public static void main (String[] args){
            ArrayList<String> words = new ArrayList<>();
            words.add("envelope");
            words.add("reach");
            words.add("stern");
            words.add("notebook");
            words.add("train");
            words.add("pen");
            words.add("learn");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter length of word for search: ");
            int wordLength = input.nextInt();

            for (String word : words)   {
                if (word.length() == wordLength)    {
                    System.out.println(word);
                }
            }

//            for (String word : words) {
//                if (word.length() == 5) {
//                    System.out.println(word);
//                }
//            }
    }
}

